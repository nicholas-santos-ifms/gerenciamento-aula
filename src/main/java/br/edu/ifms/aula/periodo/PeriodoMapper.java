package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.aula.disciplina.DisciplinaMapper;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(
        config = BaseObjectMapper.class,
        uses = { DisciplinaMapper.class }
)
public interface PeriodoMapper extends ISimpleMapper<Periodo, PeriodoDto, PeriodoForm> {
    
    public static final PeriodoMapper INSTANCE = Mappers
            .getMapper(PeriodoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    public Periodo formToEntity(PeriodoForm dto);

    @InheritConfiguration(name = "update")
    @Override
    public Periodo update(PeriodoForm dto, @MappingTarget Periodo entity);
    
}