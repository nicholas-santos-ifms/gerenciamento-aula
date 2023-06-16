/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/CargaHorarias/Class.java to edit this template
 */
package br.edu.ifms.aula.cargaHoraria;


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
public interface CargaHorariaMapper extends ISimpleMapper<CargaHoraria, CargaHorariaDto, CargaHorariaForm> {

    public static final CargaHorariaMapper INSTANCE = Mappers.getMapper(CargaHorariaMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public CargaHoraria formToEntity(CargaHorariaForm dto);
    
    @InheritConfiguration(name = "update")
    @Mapping(target = "id", ignore = true)
    @Override
    public CargaHoraria update(CargaHorariaForm dto, @MappingTarget CargaHoraria entity);

    
}

