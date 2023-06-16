package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import br.edu.ifms.aula.disciplina.DisciplinaDto;
import java.time.LocalDate;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PeriodoDto extends AdapterBaseObjectDto {

    private Long id;
    private String nome;
    private TipoPeriodo tipoPeriodo;
    private Integer numero;
    private Integer ano;
    private LocalDate inicio;
    private LocalDate fim;
    
    private DisciplinaDto disciplina;
}