package br.edu.ifms.aula.classe;

import br.edu.ifms.aula.disciplina.DisciplinaDto;
import br.edu.ifms.aula.periodo.PeriodoDto;
import br.edu.ifms.aula.turma.TurmaDto;
import java.time.LocalDate;
import java.util.List;
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
public class ClasseDto {

    private Integer vagas;

    private Integer numeroAulas;

    private LocalDate inicio;
    
    private DisciplinaDto disciplina;
    
    private PeriodoDto periodo;
    
    private TurmaDto turma;
    
    private List<HorarioDto> horarios;
}