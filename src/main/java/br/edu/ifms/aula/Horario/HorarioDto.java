/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Horario;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 *
 * @author 07041626105
 */
@Getter
@EqualsAndHashCode
@Builder
public class HorarioDto {
    
    private int diaDaSemana;
    private String horaInicio;
    private String horaFim;
}
