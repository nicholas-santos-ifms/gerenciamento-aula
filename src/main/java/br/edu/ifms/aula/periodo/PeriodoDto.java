<<<<<<< HEAD
package br.edu.ifms.aula.periodo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class PeriodoDto {
    private Long id;
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private int numero;
    private int ano;
=======
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
 * @author 1513003
 */
@Getter
@EqualsAndHashCode
@Builder
public class PeriodoDto {

    private Long id;
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private Integer numero;
    private Integer ano;
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
    private LocalDate inicio;
    private LocalDate fim;
}
