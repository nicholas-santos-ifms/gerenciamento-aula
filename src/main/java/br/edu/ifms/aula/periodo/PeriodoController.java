/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import br.edu.ifms.aula.disciplina.*;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
