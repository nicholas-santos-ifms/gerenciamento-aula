/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Horario;


import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041626105
 */
@Mapper
public interface HorarioMapper {
    
    public static final HorarioMapper INSTANCE = Mappers.getMapper(HorarioMapper.class);
    
    public HorarioDto toDto(Horario entity);
    
    public List<HorarioDto> map(List<Horario> items);

    @Mapping(target = "diaDaSemana", ignore = true)
    public void update(HorarioForm dto, @MappingTarget Horario entity);

    @Mapping(target = "diaDaSemana", ignore = true)
    public Horario toEntity(HorarioForm form);
}
