package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import br.edu.ifms.aula.curso.CursoDto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TurmaForm extends AdapterBaseObjectForm{

        @Min(1)
	private int ano;
        
        @NotNull
        private CursoDto curso;

}
