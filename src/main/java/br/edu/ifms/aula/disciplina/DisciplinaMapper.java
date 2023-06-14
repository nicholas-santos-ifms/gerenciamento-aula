/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.aula.curso.CursoMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 1513003
 */
@Mapper(
        uses = {CursoMapper.class}
)
public interface DisciplinaMapper extends ISimpleMapper<Disciplina,DisciplinaDto,DisciplinaForm>{
    
   public static final DisciplinaMapper INSTANCE = Mappers
            .getMapper(DisciplinaMapper.class);

    @Mapping(target = "id", ignore = true)
    @Override
    public Disciplina formToEntity(DisciplinaForm dto);

    @Mapping(target = "id", ignore = true)
    @Override
    public Disciplina update(DisciplinaForm dto, @MappingTarget Disciplina entity);
    
    
}
