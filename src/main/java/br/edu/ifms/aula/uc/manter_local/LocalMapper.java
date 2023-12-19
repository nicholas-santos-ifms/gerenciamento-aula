/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.local;

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
public interface LocalMapper extends ISimpleMapper<Local, LocalDto, LocalForm> {

    public static final LocalMapper INSTANCE = Mappers.getMapper(LocalMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Local formToEntity(LocalForm dto);

    @Override
    public Local dtoToEntity(LocalDto dto);

    @Override
    public LocalDto toDto(Local entity);

    @InheritConfiguration(name = "update")
    @Override
    public Local update(LocalForm dto, @MappingTarget Local entity);

    @Override
    public List<Local> toEntityList(List<LocalDto> items);

    @Override
    public List<LocalDto> toDtoList(List<Local> items);

    @Override
    public default Page<LocalDto> toDtoPage(Page<Local> items) {
        return items.map(entity -> toDto(entity));
    }
}
