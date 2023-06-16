//package br.edu.ifms.aula.horario;
//
//import jakarta.validation.Valid;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/horario")
//public class HorarioController {
//    @Autowired
//	    private HorarioService service;
//	    
//	    @GetMapping
//	    public ResponseEntity<List<HorarioDto>> listar() {
//	        List<Horario> listaEntity = service.listar();
//	        List<HorarioDto> listaDto = HorarioMapper.INSTANCE.map(listaEntity);
//	        return ResponseEntity.ok(listaDto);
//	    }
//
//	    @PostMapping
//	    @Transactional
//	    public ResponseEntity<HorarioDto> cadastrar(
//	            @RequestBody @Valid HorarioForm form) {
//	    	Horario entity = HorarioMapper.INSTANCE.toEntity(form);
//	        service.salvar(entity);
//	        HorarioDto dto = HorarioMapper.INSTANCE.toDto(entity);
//	        return ResponseEntity.accepted().body(dto);
//	    }
//	    
//	    @PutMapping("/{id}")
//	    @Transactional
//	    public ResponseEntity<HorarioDto> atualizar(
//	            @PathVariable Long id,
//	            @RequestBody @Valid HorarioForm form) {
//	    	Horario entity = service.atualizar(id, form);
//	    	HorarioDto dto = HorarioMapper.INSTANCE.toDto(entity);
//	        return ResponseEntity.ok(dto);
//	    }
//	    
//	    @DeleteMapping("/{id}")
//	    @Transactional
//	    public ResponseEntity<?> excluir(@PathVariable Long id) {
//	        service.excluir(id);
//	        return ResponseEntity.ok().build();
//	    }
//}
