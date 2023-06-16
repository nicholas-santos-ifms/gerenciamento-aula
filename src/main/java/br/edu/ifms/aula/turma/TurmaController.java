<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

<<<<<<< HEAD
@RestController
@RequestMapping("/api/turma")
public class TurmaController extends AbstractSimpleController 
        <Turma, Long, TurmaDto, TurmaForm, TurmaRepository, TurmaService>{
    
=======
/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/turma")
public class TurmaController extends AbstractSimpleController
        <Turma, Long, TurmaDto, TurmaForm, TurmaRepository, TurmaService> {

    @Autowired
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
    @Override
    public void setService(TurmaService service) {
        super.service = service;
        super.setMapper(TurmaMapper.INSTANCE);
<<<<<<< HEAD
        
    }
    @Override
    public URI createUri (Turma entity, UriComponentsBuilder uriBuilder) {
=======
    }

    @Override
    public URI createUri(Turma entity, UriComponentsBuilder uriBuilder) {
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
        return uriBuilder.path("/api/turma/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
<<<<<<< HEAD
=======

>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
}
