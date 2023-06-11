/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.campus;

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
@RequestMapping("/api/campus")
public class CampusController 
        extends AbstractSimpleController<Campus, Long, CampusDto, CampusForm, CampusRepository, CampusService>  {

    @Autowired
    @Override
    public void setService(CampusService service) {
        super.service = service;
        super.setMapper(CampusMapper.INSTANCE);
    }

    @Override
    public URI createUri(Campus entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/campus/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}