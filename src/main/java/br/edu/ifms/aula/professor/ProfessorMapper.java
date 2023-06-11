/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.professor;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface ProfessorMapper extends ISimpleMapper<Professor, ProfessorDto, ProfessorForm> {

    public static final ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Professor formToEntity(ProfessorForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Professor update(ProfessorForm dto, @MappingTarget Professor entity);

    
}
