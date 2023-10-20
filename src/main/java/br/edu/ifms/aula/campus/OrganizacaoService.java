/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.v010.service.AbstractBasicService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 *
 * @author nicho
 */
@Service
public class OrganizacaoService extends AbstractBasicService<Organizacao, Long, OrganizacaoForm, OrganizacaoRepository> {

    @Autowired
    @Override
    public void setRepository(OrganizacaoRepository repository) {
        super.repository = repository;
        setMapper(OrganizacaoMapper.INSTANCE);
    }
}
