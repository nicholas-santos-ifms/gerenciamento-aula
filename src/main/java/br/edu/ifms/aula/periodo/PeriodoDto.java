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
    private LocalDate inicio;
    private LocalDate fim;
}
