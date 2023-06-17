/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 1513003
 */
@Service
public class ClasseService extends AbstractService
        <Classe, ClasseId, ClasseForm, ClasseRepository> {

    @Autowired
    @Override
    public void setRepository(ClasseRepository repository) {
        super.repository = repository;
        super.setMapper(ClasseMapper.INSTANCE);
    }
}