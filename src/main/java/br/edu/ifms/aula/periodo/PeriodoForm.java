package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PeriodoForm extends AdapterBaseObjectForm {
       
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