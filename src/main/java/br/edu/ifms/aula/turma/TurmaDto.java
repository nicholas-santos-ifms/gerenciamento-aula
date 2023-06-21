package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class TurmaDto extends AdapterBaseObjectDto {

    private int ano;
    private String nomeCurso;
    private String nomeCampus;
}
