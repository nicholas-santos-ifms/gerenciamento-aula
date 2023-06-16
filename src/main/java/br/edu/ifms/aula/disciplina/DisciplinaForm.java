package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.curso.CursoDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class DisciplinaForm {

    private String nome;
    private Double cargaHoraria;
    private String ementa;
    
    private CursoDto curso;
}