/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author 1513003
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PeriodoForm extends AdapterBaseObjectForm {

    @NotNull
    private TipoPeriodo tipoPeriodo;

    @NotNull
    @Min(1)
    private Integer numero;

    @NotNull
    @Positive
    private Integer ano;

    @NotNull
    @FutureOrPresent
    private LocalDate inicio;

    @NotNull
    @Future
    private LocalDate fim;
}