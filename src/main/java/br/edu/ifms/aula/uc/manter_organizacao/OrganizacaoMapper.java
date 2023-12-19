/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_organizacao;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ILeanMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author nicho
 */
@Mapper(
        config = BaseObjectMapper.class
)
public interface OrganizacaoMapper extends ILeanMapper<Organizacao, OrganizacaoDto, OrganizacaoLeanDto, OrganizacaoForm> {

    public static final OrganizacaoMapper INSTANCE = Mappers.getMapper(OrganizacaoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Organizacao formToEntity(OrganizacaoForm dto);

    @Mapping(target = "superior", ignore = true)
    @Override
    public Organizacao leanDtoToEntity(OrganizacaoLeanDto dto);

    @InheritConfiguration(name = "update")
    @Override
    public Organizacao update(OrganizacaoForm dto, @MappingTarget Organizacao entity);

}
