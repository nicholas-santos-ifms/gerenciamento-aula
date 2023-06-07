/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Local;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper
public interface LocalMapper {
    public static final LocalMapper INSTANCE = Mappers
            .getMapper(LocalMapper.class);
    
    public LocalDto toDto(Local entity);
    
    public List<LocalDto> map(List<Local> items);

    @Mapping(target = "id", ignore = true)
    public void update(LocalForm dto, @MappingTarget Local entity);

    @Mapping(target = "id", ignore = true)
    public Local toEntity(LocalForm form);
}
