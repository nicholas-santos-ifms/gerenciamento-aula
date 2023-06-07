package br.edu.ifms.aula.local;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;


public class LocalMapper {

    public interface LocalMapper {
    public static final br.edu.ifms.aula.cargaHoraria.LocalMapper INSTANCE = Mappers
            .getMapper(br.edu.ifms.aula.cargaHoraria.LocalMapper.class);
    
    public LocalDto toDto(Local entity);
    
    public List<LocalDto> map(List<Local> items);

    @Mapping(target = "id", ignore = true)
    public void update(LocalForm dto, @MappingTarget Local entity);

    @Mapping(target = "id", ignore = true)
    public Local toEntity(LocalForm form); 
}
}
