/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_disciplina;

import br.edu.ifms.arch.v010.dto.AdapterBaseObjectForm;
import br.edu.ifms.aula.curso.CursoDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 1513003
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DisciplinaForm extends AdapterBaseObjectForm {

    private Double cargaHoraria;
    private String ementa;
    
    private CursoDto curso;
}
