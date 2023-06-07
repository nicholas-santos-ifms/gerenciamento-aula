
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.curso.CursoDto;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode
@Builder
public class DisciplinaForm {

    private String nome;
    private Double cargaHoraria;
    private String ementa;
    
    private CursoDto curso;
}
