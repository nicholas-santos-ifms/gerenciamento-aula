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