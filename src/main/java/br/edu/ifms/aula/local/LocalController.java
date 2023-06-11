/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.local;

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
@RequestMapping("/api/Local")
public class LocalController 
        extends AbstractSimpleController<Local, Long, LocalDto, LocalForm, LocalRepository, LocalService>  {

    @Autowired
    @Override
    public void setService(LocalService service) {
        super.service = service;
        super.setMapper(LocalMapper.INSTANCE);
    }

    @Override
    public URI createUri(Local entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/Local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}