/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.aula.curso.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@EqualsAnd

public class Turma extends BaseObject {
    
   @Column(columnDefinition = "integer no null") 
    private int ano;
   
   @ManyToOne
   private Curso curso;
}
