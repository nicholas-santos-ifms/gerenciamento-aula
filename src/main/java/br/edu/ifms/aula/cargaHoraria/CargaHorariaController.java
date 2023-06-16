/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/CargaHorarias/Class.java to edit this template
 */
package br.edu.ifms.aula.cargaHoraria;


import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 07041626105
 */
@RestController
@RequestMapping("/api/CargaHoraria")
public class CargaHorariaController 
        extends AbstractSimpleController<CargaHoraria, Long, CargaHorariaDto, CargaHorariaForm, CargaHorariaRepository, CargaHorariaService>  {

    @Autowired
    @Override
    public void setService(CargaHorariaService service) {
        super.service = service;
        super.setMapper(CargaHorariaMapper.INSTANCE);
    }

    @Override
    public URI createUri(CargaHoraria entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/CargaHoraria/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}