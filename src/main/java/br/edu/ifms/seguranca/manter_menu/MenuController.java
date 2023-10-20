/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_menu;

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
@RequestMapping("api/menus")
@Profile(value = {"prod", "dev", "test"})
public class MenuController extends AbstractLeanController<
        Menu, Long, MenuDto, MenuLeanDto, MenuForm, MenuRepository, MenuService> {

    @Autowired
    @Override
    public void setService(MenuService service) {
        super.service = service;
        super.setMapper(MenuMapper.INSTANCE);
    }

    @Override
    public URI createUri(Menu entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/menus/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
