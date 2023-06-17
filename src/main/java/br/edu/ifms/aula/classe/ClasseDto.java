/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.classe;

import br.edu.ifms.aula.disciplina.DisciplinaDto;
import br.edu.ifms.aula.periodo.PeriodoDto;
import br.edu.ifms.aula.turma.TurmaDto;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author 1513003
 */
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