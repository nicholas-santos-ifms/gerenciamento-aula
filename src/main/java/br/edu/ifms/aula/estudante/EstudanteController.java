/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Estudante;


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
@RequestMapping("/api/estudante")
public class EstudanteController 
        extends AbstractSimpleController<Estudante, Long, EstudanteDto, EstudanteForm, EstudanteRepository, EstudanteService>  {

    @Autowired
    @Override
    public void setService(EstudanteService service) {
        super.service = service;
        super.setMapper(EstudanteMapper.INSTANCE);
    }

    @Override
    public URI createUri(Estudante entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/estudante/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}