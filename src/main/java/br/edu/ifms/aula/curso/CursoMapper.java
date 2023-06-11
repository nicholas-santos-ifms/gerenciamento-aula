/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.curso;

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
public interface CursoMapper extends ISimpleMapper<Curso, CursoDto, CursoForm> {

    public static final CursoMapper INSTANCE = Mappers.getMapper(CursoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Curso formToEntity(CursoForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Curso update(CursoForm dto, @MappingTarget Curso entity);

    
}