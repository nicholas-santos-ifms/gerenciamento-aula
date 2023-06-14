package br.edu.ifms.aula.classe;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClasseMapper {
    public static final ClasseMapper INSTANCE = Mappers.getMapper(ClasseMapper.class);
    
    public ClasseDto toDto(Classe entity);
    
    public List<ClasseDto> map(List<Classe> items);

}
