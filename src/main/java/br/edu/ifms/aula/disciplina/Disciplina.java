/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 *
 * @author 07076063140
 */
public class Disciplina {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private double cargaHoraria;
    private String ementa;
}
