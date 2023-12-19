/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_periodo;

import br.edu.ifms.arch.v010.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/periodo")
public class PeriodoController extends AbstractSimpleController<Periodo, Long, PeriodoDto, PeriodoForm, PeriodoRepository, PeriodoService> {

    @Autowired
    @Override
    public void setService(PeriodoService service) {
        super.service = service;
        super.setMapper(PeriodoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Periodo entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/periodo/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
