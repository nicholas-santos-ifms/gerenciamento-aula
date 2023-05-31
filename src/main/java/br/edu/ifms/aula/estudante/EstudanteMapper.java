/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.estudante;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 07041615162
 */
@Mapper(
        uses = {CursoMapper.class}
)
public class EstudanteMapper {
    public static final EstudanteMapper INSTANCE = Mappers
            .getMapper(EstudanteMapper.class);
    
    public EstudanteDto toDto(Estudante entity);
    
    public List<EstudanteDto> map(List<Estudante> items);

    @Mapping(target = "id", ignore = true)
    public void update(EstudanteForm dto, @MappingTarget Estudante entity);

    @Mapping(target = "id", ignore = true)
    public Estudante toEntity(EstudanteForm form);
}
