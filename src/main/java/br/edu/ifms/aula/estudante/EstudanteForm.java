/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.estudante;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author 07041615162
 */
@Data
@EqualsAndHashCode
@Builder
public class EstudanteForm {
    private long id;
    private String nome;
    private String ra;
    private String cpf;
    private String situacao;
}
