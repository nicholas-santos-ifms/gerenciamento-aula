/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.seguranca.manter_submenu;

import br.edu.ifms.arch.v010.service.AbstractBasicService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 1513003
 */
@Service
public class SubmenuService 
    extends AbstractBasicService<Submenu, Long, SubmenuForm, SubmenuRepository>{

    @Autowired
    @Override
    public void setRepository(SubmenuRepository repository) {
        this.repository = repository;
        super.setMapper(SubmenuMapper.INSTANCE);
    }

    @Override
    public List<Submenu> listar() {
        return repository.findByDisponivel(Boolean.TRUE);
    }
}
