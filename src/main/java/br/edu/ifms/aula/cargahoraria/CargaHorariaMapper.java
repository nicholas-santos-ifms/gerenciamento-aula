/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.cargahoraria;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

/**
 *
 * @author nicho
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface CargaHorariaMapper extends ISimpleMapper<CargaHoraria, CargaHorariaDto, CargaHorariaForm> {

    public static final CargaHorariaMapper INSTANCE = Mappers.getMapper(CargaHorariaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public CargaHoraria formToEntity(CargaHorariaForm dto);

    @Override
    public CargaHoraria dtoToEntity(CargaHorariaDto dto);

    @Override
    public CargaHorariaDto toDto(CargaHoraria entity);

    @InheritConfiguration(name = "update")
    @Override
    public CargaHoraria update(CargaHorariaForm dto, @MappingTarget CargaHoraria entity);

    @Override
    public List<CargaHoraria> toEntityList(List<CargaHorariaDto> items);

    @Override
    public List<CargaHorariaDto> toDtoList(List<CargaHoraria> items);

    @Override
    public default Page<CargaHorariaDto> toDtoPage(Page<CargaHoraria> items) {
        return items.map(entity -> toDto(entity));
    }
}