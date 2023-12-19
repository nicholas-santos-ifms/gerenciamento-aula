/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_local;

import br.edu.ifms.arch.v010.controller.AbstractBasicController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author nicho
 */
@RestController
@RequestMapping("/api/local")
public class LocalController extends AbstractBasicController<Local, LocalDto, LocalForm, LocalRepository, LocalService, Long> {

    @Autowired
    @Override
    public void setService(LocalService service) {
        this.service = service;
        setMapper(LocalMapper.INSTANCE);
    }

    @Override
    public URI createUri(Local entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
