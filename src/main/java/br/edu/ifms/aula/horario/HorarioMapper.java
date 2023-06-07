package br.edu.ifms.aula.horario;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HorarioMapper {
     public static final HorarioMapper INSTANCE = Mappers.getMapper(HorarioMapper.class);
    
    public HorarioDto toDto(Horario entity);
    
    public List<HorarioDto> map(List<Horario> items);

    @Mapping(target = "id", ignore = true)
    public void update(HorarioForm dto, @MappingTarget Horario entity);

    @Mapping(target = "id", ignore = true)
    public Horario toEntity(HorarioForm form);
}
