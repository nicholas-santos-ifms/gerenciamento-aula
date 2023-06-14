/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.estudante;

import br.edu.ifms.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;




public interface EstudanteMapper extends ISimpleMapper<Estudante, EstudanteDto, EstudanteForm> {
    
        public static final EstudanteMapper INSTANCE = Mappers
            .getMapper(EstudanteMapper.class);
    
     @InheritConfiguration(name = "toEntity")
     @Override
        public Estudante formToEntity(EstudanteForm dto);
     
    @InheritConfiguration(name = "update")    
    @Mapping(target = "id", ignore = true)
    public Estudante update(EstudanteForm dto, @MappingTarget Estudante entity);

}
