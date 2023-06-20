/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.aula.turma.Turma;
import br.edu.ifms.aula.turma.TurmaForm;
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
public interface TurmaMapper extends ISimpleMapper<Turma, TurmaDto, TurmaForm> {

    
   
    public static final TurmaMapper INSTANCE = Mappers.getMapper(TurmaMapper.class);
    @InheritConfiguration(name = "toEntity")
    @Override
    public Turma formToEntity(TurmaForm dto);
    
    @InheritConfiguration(name = "update")
   
    @Override
    public Turma update(TurmaForm dto, @MappingTarget Turma entity);

    @Mapping(target = "curso", ignore = true)
    @Override
    public Turma dtoToEntity(TurmaDto dto);

//     @Mapping(target = "nomeCurso", source = "entity.curso.nome")
//     @Mapping(target = "nomeCampus", source = "entity.curso.campus.nome")
//    @Override
//    public Turma dtoToEntity(TurmaDto dto);

    
   
}