/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_professor;

import br.edu.ifms.arch.v010.BaseObjectMapper;
import br.edu.ifms.arch.v010.ILeanMapper;
import br.edu.ifms.seguranca.manter_arquivo.ArquivoMapper;
import br.edu.ifms.seguranca.manter_perfil.PerfilMapper;
import br.edu.ifms.seguranca.manter_usuario.UsuarioMapper;
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
        uses = {
            ArquivoMapper.class,
            UsuarioMapper.class,
            PerfilMapper.class
        }
)
public interface ProfessorMapper
        extends ILeanMapper<Professor, ProfessorDto, ProfessorLeanDto, ProfessorForm>  {

    public static final ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "foto", ignore = true)
    @Mapping(target = "failedAttempt", ignore = true)
    @Mapping(target = "lockTime", ignore = true)
    @Mapping(target = "accountNonLocked", ignore = true)
    @Mapping(target = "lastFailedLoginTime", ignore = true)
    @Override
    public Professor formToEntity(ProfessorForm dto);

    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "failedAttempt", ignore = true)
    @Mapping(target = "lockTime", ignore = true)
    @Mapping(target = "accountNonLocked", ignore = true)
    @Mapping(target = "lastFailedLoginTime", ignore = true)
    @Override
    public Professor dtoToEntity(ProfessorDto dto);

    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "failedAttempt", ignore = true)
    @Mapping(target = "lockTime", ignore = true)
    @Mapping(target = "accountNonLocked", ignore = true)
    @Mapping(target = "lastFailedLoginTime", ignore = true)
    @Mapping(target = "perfis", ignore = true)
    @Override
    public Professor leanDtoToEntity(ProfessorLeanDto dto);

    @InheritConfiguration(name = "update")
    @Mapping(target = "senha", ignore = true)
    @Mapping(target = "foto", ignore = true)
    @Mapping(target = "failedAttempt", ignore = true)
    @Mapping(target = "lockTime", ignore = true)
    @Mapping(target = "accountNonLocked", ignore = true)
    @Mapping(target = "lastFailedLoginTime", ignore = true)
    @Mapping(target = "authorities", ignore = true)
    @Mapping(target = "authorityNames", ignore = true)
    @Override
    public Professor update(ProfessorForm dto, @MappingTarget Professor entity);

    
}
