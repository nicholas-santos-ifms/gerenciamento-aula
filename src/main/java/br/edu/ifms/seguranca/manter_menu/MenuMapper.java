/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.seguranca.manter_menu;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ILeanMapper;
import br.edu.ifms.seguranca.manter_submenu.SubmenuMapper;
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
        uses = { SubmenuMapper.class }
)
public interface MenuMapper
        extends ILeanMapper<Menu, MenuDto, MenuLeanDto, MenuForm> {

    public static final MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Mapping(target = "perfis", ignore = true)
    @Override
    public Menu formToEntity(MenuForm dto);
   
    @InheritConfiguration(name = "update")
    @Mapping(target = "perfis", ignore = true)
    @Override
    Menu update(MenuForm dto, @MappingTarget Menu entity);

    @Mapping(target = "submenus", ignore = true)
    @Mapping(target = "perfis", ignore = true)
    @Override
    public Menu leanDtoToEntity(MenuLeanDto dto);

    @Mapping(target = "perfis", ignore = true)
    @Override
    public Menu dtoToEntity(MenuDto dto);
    
    
}
