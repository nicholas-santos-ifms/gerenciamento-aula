/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_organizacao;

import br.edu.ifms.arch.v010.service.AbstractService;
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
public class OrganizacaoService extends AbstractService<Organizacao, Long, OrganizacaoForm, OrganizacaoRepository> {

    @Autowired
    @Override
    public void setRepository(OrganizacaoRepository repository) {
        super.repository = repository;
        setMapper(OrganizacaoMapper.INSTANCE);
    }

    public Page<Organizacao> listar(
            String nome,
            String sigla,
            Long organizacaoId,
            Pageable paginacao) {
        List<Specification<Organizacao>> l = new ArrayList();

        if (StringUtils.hasText(nome)) {
            Specification<Organizacao> spec = (root, query, criteriaBuilder)
                    -> criteriaBuilder.like(
                            criteriaBuilder.upper(root.get("nome")),
                            "%" + nome.toUpperCase() + "%");
            l.add(spec);
        }

        if (StringUtils.hasText(sigla)) {
            Specification<Organizacao> spec = (root, query, criteriaBuilder)
                    -> criteriaBuilder.like(
                            root.get("nome"), nome);
            l.add(spec);
        }

        if (organizacaoId != null && organizacaoId > 0) {
            Specification<Organizacao> spec = (root, query, criteriaBuilder)
                    -> criteriaBuilder.equal(
                            root.get("superior")
                                    .get("id"), organizacaoId);
            l.add(spec);
        }

        if (l.isEmpty()) {
            return repository.findAll(paginacao);
        }

        Specification<Organizacao> result = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            result = Specification.where(result).and(l.get(i));
        }

        return repository.findAll(result, paginacao);
    }
}
