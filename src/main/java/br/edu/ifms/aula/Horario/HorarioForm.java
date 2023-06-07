/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Horario;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author 07041626105
 */
@Data
@EqualsAndHashCode
@Builder
public class HorarioForm {
    
    private String horaInicio;
    private String horaFim; 
    
}
