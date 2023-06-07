/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import java.time.LocalDate;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 *
 * @author 02709564173
 */
@Getter
@EqualsAndHashCode
@Builder
public class PeriodoDto {
    private Long id;
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private int numero;
    private int ano;
    private LocalDate inicio;
    private LocalDate fim;
}
