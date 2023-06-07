<<<<<<< HEAD
package br.edu.ifms.aula.periodo;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PeriodoForm {
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private int numero;
    private int ano;
    private LocalDate inicio;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

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
 * @author 1513003
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
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
    private LocalDate fim;
}
