/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/CargaHorarias/Class.java to edit this template
 */
package br.edu.ifms.aula.cargaHoraria;


import java.util.List;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author 02709564173
 */
public interface CargaHorariaMapper {
    public static final CargaHorariaMapper INSTANCE = Mappers.getMapper(CargaHorariaMapper.class);
    
    public CargaHorariaDto toDto(CargaHoraria entity);
    
    public List<CargaHorariaDto>map(List<CargaHoraria>itens);
    
    @Mapping(target = "id", ignore = true)
    public void update(CargaHorariaForm dto, @MappingTarget CargaHoraria entity);
    
    @Mapping(target = "id", ignore = true)
    public CargaHoraria toEntity(CargaHorariaForm form);
}
