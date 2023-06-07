/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.classe;


import java.util.List;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 02709564173
 */
public interface ClasseMapper {
    public static final ClasseMapper INSTANCE = Mappers.getMapper(ClasseMapper.class);
    
    public ClasseDto toDto(Classe entity);
    
    public List<ClasseDto>map(List<Classe>itens);
    
    @Mapping(target = "id", ignore = true)
    public void update(ClasseForm dto, @MappingTarget Classe entity);
    
    @Mapping(target = "id", ignore = true)
    public Classe toEntity(ClasseForm form);
}