<<<<<<< HEAD
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
package br.edu.ifms.aula.periodo;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

<<<<<<< HEAD
@Mapper
public interface PeriodoMapper {
    public static final PeriodoMapper INSTANCE = Mappers.getMapper(PeriodoMapper.class);
    
    public PeriodoDto toDto(Periodo entity);
    
    public List<PeriodoDto> map(List<Periodo> items);

    @Mapping(target = "id", ignore = true)
    public void update(PeriodoForm dto, @MappingTarget Periodo entity);

    @Mapping(target = "id", ignore = true)
    public Periodo toEntity(PeriodoForm form);
=======
/**
 *
 * @author 1513003
 */
@Mapper
public interface PeriodoMapper {
    
    public static final PeriodoMapper INSTANCE = Mappers
            .getMapper(PeriodoMapper.class);
    
    @Mapping(target = "id", ignore = true)
    Periodo formToEntity(PeriodoForm dto);
    
    PeriodoDto toDto(Periodo entity);
    
    @Mapping(target = "id", ignore = true)
    void update(PeriodoForm dto, @MappingTarget Periodo entity);
    
    List<PeriodoDto> map(List<Periodo> itens);
    
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
}
