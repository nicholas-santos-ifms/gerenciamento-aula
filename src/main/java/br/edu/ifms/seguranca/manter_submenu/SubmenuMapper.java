/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.seguranca.manter_submenu;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ILeanMapper;
import br.edu.ifms.seguranca.manter_menu.MenuMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 1513003
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = { MenuMapper.class }
)
public interface SubmenuMapper
        extends ILeanMapper<Submenu, SubmenuDto, SubmenuLeanDto, SubmenuForm> {

    public static final SubmenuMapper INSTANCE = Mappers.getMapper(SubmenuMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Mapping(target = "menus", ignore = true)
    @Override
    public Submenu formToEntity(SubmenuForm dto);

    @InheritConfiguration(name = "update")
    @Mapping(target = "menus", ignore = true)
    @Override
    public Submenu update(
            SubmenuForm dto, 
            @MappingTarget Submenu entity);

    @Mapping(target = "menus", ignore = true)
    @Override
    public Submenu leanDtoToEntity(SubmenuLeanDto dto);


}
