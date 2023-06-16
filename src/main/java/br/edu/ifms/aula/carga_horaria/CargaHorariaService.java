/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.carga_horaria;

import br.edu.ifms.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicho
 */
@Service
public class CargaHorariaService extends AbstractBasicService<CargaHoraria, Long, CargaHorariaForm, CargaHorariaRepository> {

    @Autowired
    @Override
    public void setRepository(CargaHorariaRepository repository) {
        super.repository = repository;
        setMapper(CargaHorariaMapper.INSTANCE);
    }
}
