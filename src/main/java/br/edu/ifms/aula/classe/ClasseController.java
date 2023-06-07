package br.edu.ifms.aula.classe;

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

@RestController
@RequestMapping("/api/classe")
public class ClasseController {
    @Autowired
	    private ClasseService service;
	    
	    @GetMapping
	    public ResponseEntity<List<ClasseDto>> listar() {
	        List<Classe> listaEntity = service.listar();
	        List<ClasseDto> listaDto = ClasseMapper.INSTANCE.map(listaEntity);
	        return ResponseEntity.ok(listaDto);
	    }

	    @PostMapping
	    @Transactional
	    public ResponseEntity<ClasseDto> cadastrar(
	            @RequestBody @Valid ClasseForm form) {
	    	Classe entity = ClasseMapper.INSTANCE.toEntity(form);
	        service.salvar(entity);
	        ClasseDto dto = ClasseMapper.INSTANCE.toDto(entity);
	        return ResponseEntity.accepted().body(dto);
	    }
	    
	    @PutMapping("/{id}")
	    @Transactional
	    public ResponseEntity<ClasseDto> atualizar(
	            @PathVariable Long id,
	            @RequestBody @Valid ClasseForm form) {
	    	Classe entity = service.atualizar(id, form);
	    	ClasseDto dto = ClasseMapper.INSTANCE.toDto(entity);
	        return ResponseEntity.ok(dto);
	    }
	    
	    @DeleteMapping("/{id}")
	    @Transactional
	    public ResponseEntity<?> excluir(@PathVariable Long id) {
	        service.excluir(id);
	        return ResponseEntity.ok().build();
	    }
}
