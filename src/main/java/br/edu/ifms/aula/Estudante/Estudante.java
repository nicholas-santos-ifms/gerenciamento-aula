/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Estudante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@Data
@EqualsAndHashCode (callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Estudante {
 
     @GeneratedValue
    private Long id;
    private String nome;
    private String ra;
    private String cpf;
    private String situacao;
}
