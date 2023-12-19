/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_periodo;

import br.edu.ifms.arch.v010.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 1513003
 */
@Service
public class PeriodoService extends AbstractService
        <Periodo, Long, PeriodoForm, PeriodoRepository> {

    @Autowired
    @Override
    public void setRepository(PeriodoRepository repository) {
        super.repository = repository;
        super.setMapper(PeriodoMapper.INSTANCE);
    }
}
