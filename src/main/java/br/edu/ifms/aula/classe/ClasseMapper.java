/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.BaseObjectMapper;
import br.edu.ifms.arch.ISimpleMapper;
import br.edu.ifms.aula.disciplina.DisciplinaMapper;
import br.edu.ifms.aula.periodo.PeriodoMapper;
import br.edu.ifms.aula.turma.TurmaMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * @author 1513003
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = {DisciplinaMapper.class, PeriodoMapper.class,
                TurmaMapper.class}
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


}