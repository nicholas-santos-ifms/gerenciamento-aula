package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import br.edu.ifms.aula.professor.Professor;
import br.edu.ifms.aula.professor.ProfessorDto;
import br.edu.ifms.aula.professor.ProfessorForm;
import br.edu.ifms.aula.professor.ProfessorMapper;
import org.mapstruct.InheritConfiguration;


@Mapper
public interface TurmaMapper {

public static final TurmaMapper INSTANCE = ISimpleMapper<Turma,TurmaDto,TurmaForm>{
  
}
 public static final TurmaMapper INSTANCE = Mapper.getMapper(classi:TurmaMapper.class);
 @InheritConfiguration(nome = "toEntity")
 @Override
 public turma formToEntity (TurmaForm dto);
  @InheritConfiguration(nome = "toEntity")
 @Override
 
}
    

