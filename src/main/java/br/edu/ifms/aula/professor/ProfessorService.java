/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.professor;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class ProfessorService 
        extends AbstractService<Professor, Long, ProfessorForm, ProfessorRepository> {

    @Autowired
    @Override
    public void setRepository(ProfessorRepository repository) {
        super.repository = repository;
        super.setMapper(ProfessorMapper.INSTANCE);
    }
    
    
}
