/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_disciplina;

import br.edu.ifms.arch.v010.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController extends AbstractSimpleController
        <Disciplina, Long, DisciplinaDto, DisciplinaForm, DisciplinaRepository, DisciplinaService> {

    @Autowired
    @Override
    public void setService(DisciplinaService service) {
        super.service = service;
        super.setMapper(DisciplinaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Disciplina entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/disciplina/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
