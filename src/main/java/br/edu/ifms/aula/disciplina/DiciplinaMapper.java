/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.curso.CursoMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper(
        uses = {CursoMapper.class}
)

public interface DiciplinaMapper{
    
    public static final DiciplinaMapper INSTANCE = Mappers.getMapper(DiciplinaMapper.class);
    
    public DiciplinaDto toDto(Diciplina entity);
    
    public List<DiciplinaDto>map(List<Diciplina>itens);
    
    @Mapping(target = "id", ignore = true)
    public void update(DiciplinaForm dto, @MappingTarget Diciplina entity);
    
    @Mapping(target = "id", ignore = true)
    public Diciplina toEntity(DiciplinaForm form);
}
