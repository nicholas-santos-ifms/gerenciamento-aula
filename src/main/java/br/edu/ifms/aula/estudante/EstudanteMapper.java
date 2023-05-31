package br.edu.ifms.aula.estudante;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(
  uses = {EstudanteMapper.class}
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
