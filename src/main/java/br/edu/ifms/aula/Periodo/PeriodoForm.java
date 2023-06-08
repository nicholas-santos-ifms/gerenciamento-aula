/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Periodo;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author 07041626105
 */
@Data
@EqualsAndHashCode
@Builder
public class PeriodoForm {
    
    @NotNull
    @NotEmpty
    @NotBlank
    private String nome;

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
