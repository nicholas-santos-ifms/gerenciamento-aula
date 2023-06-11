/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.curso;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 07041626105
 */
@RestController
@RequestMapping("/api/Curso")
public class CursoController 
        extends AbstractSimpleController<Curso, Long, CursoDto, CursoForm, CursoRepository, CursoService>  {

    @Autowired
    @Override
    public void setService(CursoService service) {
        super.service = service;
        super.setMapper(CursoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Curso entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Curso/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}