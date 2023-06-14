/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.aula;



import br.edu.ifms.arch.BaseObject;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "Aula_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Aula extends BaseObject {
 
    private int sequencia;
    private LocalDate data;
    private  String horaInicio;
    private String horaFim;
    
}