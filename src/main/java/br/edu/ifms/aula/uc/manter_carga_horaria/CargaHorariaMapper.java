/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_carga_horaria;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

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

    @InheritConfiguration(name = "update")
    @Override
    public CargaHoraria update(CargaHorariaForm dto, @MappingTarget CargaHoraria entity);
}
