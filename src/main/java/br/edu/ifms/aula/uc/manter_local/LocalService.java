/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_local;

import br.edu.ifms.arch.v010.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicho
 */
@Service
public class LocalService extends AbstractBasicService<Local, Long, LocalForm, LocalRepository> {

    @Autowired
    @Override
    public void setRepository(LocalRepository repository) {
        super.repository = repository;
        setMapper(LocalMapper.INSTANCE);
    }
}
