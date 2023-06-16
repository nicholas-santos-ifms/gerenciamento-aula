
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package br.edu.ifms.aula.turma;
import br.edu.ifms.aula.curso.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import lombok.Data;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAnd
public class Turma extends BaseObject {
    
   @Column(columnDefinition = "integer no null") 
    private int ano;
   
   @ManyToOne
   private Curso curso;

@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@SequenceGenerator(sequenceName = "turma_sequence", name = "baseObjectSequence", allocationSize = 1)
@Data // Implementa os métodos GET e SET para cada atributo
@EqualsAndHashCode(callSuper = true) // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
@SuperBuilder // padrão de projeto para construção de objetos
public class Turma extends BaseObject {

    @Column(columnDefinition = "integer not null")
    private int ano;
    
    @ManyToOne
    private Curso curso;

}
