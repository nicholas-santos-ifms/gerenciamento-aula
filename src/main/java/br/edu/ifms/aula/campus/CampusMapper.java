/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * @author nicho
 */
@Mapper(config = BaseObjectMapper.class)
public interface CampusMapper extends ISimpleMapper<Campus, CampusDto, CampusForm> {

    public static final CampusMapper INSTANCE = Mappers.getMapper(CampusMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Campus formToEntity(CampusForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Campus update(CampusForm dto, @MappingTarget Campus entity);

}