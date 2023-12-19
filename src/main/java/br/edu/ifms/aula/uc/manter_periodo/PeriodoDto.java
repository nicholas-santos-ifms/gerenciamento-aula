/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_periodo;

import br.edu.ifms.arch.v010.dto.AdapterBaseObjectDto;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 1513003
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PeriodoDto extends AdapterBaseObjectDto {

    private TipoPeriodo tipoPeriodo;
    private Integer numero;
    private Integer ano;
    private LocalDate inicio;
    private LocalDate fim;
}
