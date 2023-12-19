/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_periodo;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 1513003
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface PeriodoMapper extends ISimpleMapper<Periodo, PeriodoDto, PeriodoForm> {
    
    public static final PeriodoMapper INSTANCE = Mappers
            .getMapper(PeriodoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Periodo formToEntity(PeriodoForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Periodo update(PeriodoForm dto, @MappingTarget Periodo entity);
    
}
