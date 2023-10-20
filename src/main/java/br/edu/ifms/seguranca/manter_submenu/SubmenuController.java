/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_submenu;

import br.edu.ifms.arch.v010.controller.AbstractLeanController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author santos
 */
@RestController
@RequestMapping("api/submenus")
@Profile(value = {"prod", "dev", "test"})
public class SubmenuController extends AbstractLeanController<
        Submenu, Long, SubmenuDto, SubmenuLeanDto, SubmenuForm, SubmenuRepository, SubmenuService> {

    @Autowired
    @Override
    public void setService(SubmenuService service) {
        super.service = service;
        super.setMapper(SubmenuMapper.INSTANCE);
    }

    @Override
    public URI createUri(Submenu entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/menus/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
