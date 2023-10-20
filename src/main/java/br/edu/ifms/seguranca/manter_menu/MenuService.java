/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.seguranca.manter_menu;

import br.edu.ifms.arch.v010.service.AbstractBasicService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 1513003
 */
@Service
public class MenuService 
    extends AbstractBasicService<Menu, Long, MenuForm, MenuRepository>{

    @Autowired
    @Override
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
        super.setMapper(MenuMapper.INSTANCE);
    }

    @Override
    public List<Menu> listar() {
        return repository.findByDisponivel(Boolean.TRUE);
    }
}
