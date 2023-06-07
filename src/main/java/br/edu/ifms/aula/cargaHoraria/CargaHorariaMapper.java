
package br.edu.ifms.aula.cargaHoraria;


import br.edu.ifms.aula.curso.CursoMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(
        uses = {CursoMapper.class}
)
public interface CargaHorariaMapper {
    public static final CargaHorariaMapper INSTANCE = Mappers
            .getMapper(CargaHorariaMapper.class);
    
    public CargaHorariaDto toDto(CargaHoraria entity);
    
    public List<CargaHorariaDto> map(List<CargaHoraria> items);

    @Mapping(target = "id", ignore = true)
    public void update(CargaHorariaForm dto, @MappingTarget CargaHoraria entity);

    @Mapping(target = "id", ignore = true)
    public CargaHoraria toEntity(CargaHorariaForm form);
}

