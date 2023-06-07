package br.edu.ifms.aula.cargaHoraria;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CargaHorariaController {

    @Autowired // faz o Spring criar uma instância de CargaHorariaService
    private CargaHorariaService service;

    @GetMapping
    public ResponseEntity<List<CargaHorariaDto>> listar() {
        List<CargaHoraria> listaEntity = service.listar();
        List<CargaHorariaDto> listaDto = CargaHorariaMapper.INSTANCE.map(listaEntity);
        return ResponseEntity.ok(listaDto);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<CargaHorariaDto> cadastrar(
            @RequestBody @Valid CargaHorariaForm form) {
        CargaHoraria entity = CargaHorariaMapper.INSTANCE.toEntity(form);
        service.salvar(entity);
        CargaHorariaDto dto = CargaHorariaMapper.INSTANCE.toDto(entity);
        return ResponseEntity.accepted().body(dto);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<CargaHorariaDto> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid CargaHorariaForm form) {
        CargaHoraria entity = service.atualizar(id, form);
        CargaHorariaDto dto = CargaHorariaMapper.INSTANCE.toDto(entity);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }
}
