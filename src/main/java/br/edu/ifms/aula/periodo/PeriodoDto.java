package br.edu.ifms.aula.periodo;

import java.time.LocalDate;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@Builder
public class PeriodoDto {

    private Long id;
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private Integer numero;
    private Integer ano;
    private LocalDate inicio;
    private LocalDate fim;
}