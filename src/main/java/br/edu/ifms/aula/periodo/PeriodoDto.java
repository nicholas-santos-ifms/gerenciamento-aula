/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import java.time.LocalDate;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 1513003
 */
@Getter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PeriodoDto extends AdapterBaseObjectDto {

    private Long id;
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private Integer numero;
    private Integer ano;
    private LocalDate inicio;
    private LocalDate fim;
}
