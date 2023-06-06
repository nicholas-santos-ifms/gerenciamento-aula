/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Estudante;

import br.edu.ifms.aula.turma.Turma;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author 07041626105
 */
@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Estudante {
    @Id
     @GeneratedValue
    private Long id;
    private String nome;
    private String ra;
    private String cpf;
    private String situacao;
    
    @ManyToOne
    private Turma turma;
}
