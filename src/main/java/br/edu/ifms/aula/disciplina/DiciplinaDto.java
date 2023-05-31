/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.curso.CursoDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Builder;

/**
 *
 * @author 07041626105
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class DiciplinaDto {
    
    private Long id;
    private String nome;
    private Double cargaHoraria;
    private String ementa;
    private CursoDto curso;
}
