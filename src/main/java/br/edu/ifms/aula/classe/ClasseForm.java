/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.classe;

import br.edu.ifms.aula.disciplina.DisciplinaDto;
import br.edu.ifms.aula.periodo.PeriodoDto;
import br.edu.ifms.aula.turma.TurmaDto;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author 1513003
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ClasseForm {

    private Integer vagas;

    private Integer numeroAulas;

    private LocalDate inicio;
    
    private DisciplinaDto disciplina;
    
    private PeriodoDto periodo;
    
    private TurmaDto turma;
}
