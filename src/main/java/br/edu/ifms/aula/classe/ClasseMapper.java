package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.aula.disciplina.DisciplinaMapper;
import br.edu.ifms.aula.periodo.PeriodoMapper;
import br.edu.ifms.aula.turma.TurmaMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(
        config = BaseObjectMapper.class,
        uses = { DisciplinaMapper.class, PeriodoMapper.class,
                 TurmaMapper.class }
)
public interface ClasseMapper extends ISimpleMapper<Classe, ClasseDto, ClasseForm> {
    
    public static final ClasseMapper INSTANCE = Mappers
            .getMapper(ClasseMapper.class);

    @Mapping(target = "id", expression = """
                                         java(
                                            ClasseId.builder()
                                                    .disciplinaId(dto.getDisciplina().getId())
                                                    .periodoId(dto.getPeriodo().getId())
                                                    .turmaId(dto.getTurma().getId())
                                                    .build()
                                         )
                                         """)
    @Override
    public Classe formToEntity(ClasseForm dto);

    @Mapping(target = "id", ignore = true)
    @Override
    public Classe dtoToEntity(ClasseDto dto);

    @Mapping(target = "id", ignore = true)
    @Override
    public Classe update(ClasseForm dto, @MappingTarget Classe entity);
    
    /* Operações criadas para mapear a classe Horario */
    
    @Override
    public ClasseDto toDto(Classe entity);
    
    @Mapping(target = "id.sequencia", source = "sequencia")
    @Mapping(target = "id.classe", source = "classe")
    public Horario horarioDtoToEntity(HorarioDto dto);

    @Mapping(target = "sequencia", source = "id.sequencia")
    @Mapping(target = "classe", source = "id.classe")
    public HorarioDto horarioEntityToDto(Horario entity);
    
    public List<HorarioDto> toHorarioDtoList(List<Horario> items);
}