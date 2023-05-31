/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;


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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 07041626105
 */
@RestController
@RequestMapping("/api/professor")
public class DiciplinaController {

    @Autowired // faz o Spring criar uma instância de DiciplinaService
    private DiciplinaService service;
    
    @GetMapping
    public ResponseEntity<List<DiciplinaDto>> listar() {
        List<Diciplina> listaEntity = service.listar();
        List<DiciplinaDto> listaDto = DiciplinaMapper.INSTANCE.map(listaEntity);
        return ResponseEntity.ok(listaDto);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<DiciplinaDto> cadastrar(
            @RequestBody @Valid DiciplinaForm form) {
        Diciplina entity = DiciplinaMapper.INSTANCE.toEntity(form);
        service.salvar(entity);
        DiciplinaDto dto = DiciplinaMapper.INSTANCE.toDto(entity);
        return ResponseEntity.accepted().body(dto);
    }
    
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DiciplinaDto> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid DiciplinaForm form) {
        Diciplina entity = service.atualizar(id, form);
        DiciplinaDto dto = DiciplinaMapper.INSTANCE.toDto(entity);
        return ResponseEntity.ok(dto);
    }
    
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.ok().build();
    }

}
