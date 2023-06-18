/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.carga_horaria;

import br.edu.ifms.arch.controller.AbstractBasicController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author nicho
 */
@RestController
@RequestMapping("/api/carga-horaria")
public class CargaHorariaController extends AbstractBasicController<CargaHoraria, CargaHorariaDto, CargaHorariaForm, CargaHorariaRepository, CargaHorariaService, Long> {

    @Autowired
    @Override
    public void setService(CargaHorariaService service) {
        this.service = service;
        setMapper(CargaHorariaMapper.INSTANCE);
    }

    @Override
    public URI createUri(CargaHoraria entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/carga-horaria/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
