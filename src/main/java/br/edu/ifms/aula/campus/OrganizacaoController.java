/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.v010.controller.AbstractLeanController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author nicho
 */
@RestController
@RequestMapping("/api/organizacao")
public class OrganizacaoController extends AbstractLeanController<
        Organizacao, Long, OrganizacaoDto, OrganizacaoLeanDto, 
        OrganizacaoForm, OrganizacaoRepository, OrganizacaoService> {

    @Autowired
    @Override
    public void setService(OrganizacaoService service) {
        this.service = service;
        setMapper(OrganizacaoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Organizacao entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/organizacao/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

    @GetMapping("/lean-not-used")
    @Override
    public ResponseEntity<Page<OrganizacaoLeanDto>> listarLean(Pageable paginacao) {
        return super.listarLean(paginacao); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @GetMapping
    public ResponseEntity<Page<OrganizacaoLeanDto>> listarLean(
            @RequestParam(required = false) String nome,
            @PageableDefault(sort = "nome", direction = Sort.Direction.ASC, page = 0, size = 10) Pageable paginacao) {
        this.validate();
        
        var page = service.listar(paginacao);
        return ResponseEntity
                .ok( mapper.toLeanDtoPage(page));
    }
    
}
