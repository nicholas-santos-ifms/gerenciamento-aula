/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.aula;

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
@RequestMapping("/api/aula")
public class AulaController 
        extends AbstractSimpleController<Aula, Long, AulaDto, AulaForm, AulaRepository, AulaService>  {

    @Autowired
    @Override
    public void setService(AulaService service) {
        super.service = service;
        super.setMapper(AulaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Aula entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/aula/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}