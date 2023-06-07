package br.edu.ifms.aula.periodo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
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

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Periodo {
    
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String nome;
    
    private TipoPeriodo tipoPeriodo;
    @NotNull
    @Min(1)
    private int numero;
    @NotNull
    @Positive
    private int ano;
    @NotNull
    private LocalDate inicio;
    @NotNull
    private LocalDate fim;
    
}
