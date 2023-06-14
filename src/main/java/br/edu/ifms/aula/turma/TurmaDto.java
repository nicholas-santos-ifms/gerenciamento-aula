/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import br.edu.ifms.aula.curso.CursoDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class TurmaDto extends AdapterBaseObjectDto {
    
    private int ano;
    private String nomeCurso;
    private String nomeCampus;
//    private CursoDto curso;
}