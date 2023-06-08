/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Estudante;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.aula.curso.CursoMapper;
import java.util.List;
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

public interface EstudanteMapper extends ISimpleMapper<Estudante, EstudanteDto, EstudanteForm>{
    public static final EstudanteMapper INSTANCE = Mappers.getMapper(EstudanteMapper.class);
    
    @InheritConfiguration(name = "toEntity")
    @Override
    public Estudante formToEntity(EstudanteForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public Estudante update(EstudanteForm dto, @MappingTarget Estudante entity);
    
}
