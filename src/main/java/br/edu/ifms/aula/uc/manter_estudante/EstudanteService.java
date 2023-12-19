/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_estudante;

import br.edu.ifms.arch.v010.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class EstudanteService 
        extends AbstractService<Estudante, Long, EstudanteForm, EstudanteRepository> {

    @Autowired
    @Override
    public void setRepository(EstudanteRepository repository) {
        super.repository = repository;
        super.setMapper(EstudanteMapper.INSTANCE);
    }
    
    
}
