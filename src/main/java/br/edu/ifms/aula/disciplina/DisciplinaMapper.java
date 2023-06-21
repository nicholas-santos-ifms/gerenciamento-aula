/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author usuario
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface DisciplinaMapper extends ISimpleMapper<Disciplina, DisciplinaDto, DisciplinaForm> {

    public static final DisciplinaMapper INSTANCE = Mappers.getMapper(DisciplinaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Disciplina formToEntity(DisciplinaForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Disciplina update(DisciplinaForm dto, @MappingTarget Disciplina entity);

    
}
