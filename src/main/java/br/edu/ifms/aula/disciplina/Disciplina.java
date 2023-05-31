/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.curso.Curso;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;

/**
 *
 * @author 02709564173
 */
public class Disciplina implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private Double cargaHoraria;
    private String ementa;
    
    @ManyToOne
    private Curso curso;

}
