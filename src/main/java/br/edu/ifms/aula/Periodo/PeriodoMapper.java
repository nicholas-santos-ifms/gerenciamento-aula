/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Periodo;

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
public interface PeriodoMapper {
    public static final PeriodoMapper INSTANCE = Mappers
            .getMapper(PeriodoMapper.class);

    @Mapping(target = "id", ignore = true)
    Periodo formToEntity(PeriodoForm dto);

    PeriodoDto toDto(Periodo entity);

    @Mapping(target = "id", ignore = true)
    void update(PeriodoForm dto, @MappingTarget Periodo entity);

    List<PeriodoDto> map(List<Periodo> itens);
}
