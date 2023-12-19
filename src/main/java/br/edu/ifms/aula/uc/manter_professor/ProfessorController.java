/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_professor;

import br.edu.ifms.arch.v010.controller.AbstractLeanController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/professor")
@Profile(value = {"prod", "test", "dev"})
public class ProfessorController
        extends AbstractLeanController<
            Professor, Long, ProfessorDto, ProfessorLeanDto, ProfessorForm, ProfessorRepository, ProfessorService> {

    @Autowired
    @Override
    public void setService(ProfessorService service) {
        super.service = service;
        super.setMapper(ProfessorMapper.INSTANCE);
    }

    @Override
    public URI createUri(Professor entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/professor/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
