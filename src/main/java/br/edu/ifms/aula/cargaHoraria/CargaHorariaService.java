/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/CargaHorarias/Class.java to edit this template
 */
package br.edu.ifms.aula.cargaHoraria;


import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class CargaHorariaService 
        extends AbstractService<CargaHoraria, Long, CargaHorariaForm, CargaHorariaRepository> {

    @Autowired
    @Override
    public void setRepository(CargaHorariaRepository repository) {
        super.repository = repository;
        super.setMapper(CargaHorariaMapper.INSTANCE);
    }   
}