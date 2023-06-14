/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author 02709564173
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PeriodoForm {
    @NotNull
    @NotEmpty
    @NotBlank
    private String nome;
    private TipoPeriodo tipoPeriodo;
    @NotNull
    private int numero;
    @Positive
    @FutureOrPresent
    @NotNull
    private int ano;
    @FutureOrPresent
    @NotNull
    private LocalDate inicio;
    @NotNull
    private LocalDate fim;
}
