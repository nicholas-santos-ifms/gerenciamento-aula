package br.edu.ifms.aula.turma;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TurmaMapper {

public static final TurmaMapper INSTANCE = Mappers.getMapper(TurmaMapper.class);
    
    public TurmaDto toDto(Turma entity);
    
    public List<TurmaDto> map(List<Turma> items);

    @Mapping(target = "id", ignore = true)
    public void update(TurmaForm dto, @MappingTarget Turma entity);

    @Mapping(target = "id", ignore = true)
    public Turma toEntity(TurmaForm form);
}
