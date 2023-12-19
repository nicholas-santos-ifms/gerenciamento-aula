/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_disciplina;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ISimpleMapper;
import br.edu.ifms.aula.campus.OrganizacaoMapper;
import br.edu.ifms.aula.curso.CursoMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 1513003
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = {
            OrganizacaoMapper.class,
            CursoMapper.class
        }
)
public interface DisciplinaMapper extends ISimpleMapper<Disciplina, DisciplinaDto, DisciplinaForm> {
    
    public static final DisciplinaMapper INSTANCE = Mappers
            .getMapper(DisciplinaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Disciplina formToEntity(DisciplinaForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Disciplina update(DisciplinaForm dto, @MappingTarget Disciplina entity);
    
}
