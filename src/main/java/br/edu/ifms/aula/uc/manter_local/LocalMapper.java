/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_local;

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
public interface LocalMapper extends ISimpleMapper<Local, LocalDto, LocalForm> {

    public static final LocalMapper INSTANCE = Mappers.getMapper(LocalMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Local formToEntity(LocalForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Local update(LocalForm dto, @MappingTarget Local entity);

}
