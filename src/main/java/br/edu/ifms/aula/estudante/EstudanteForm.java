package br.edu.ifms.aula.estudante;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
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
public class EstudanteForm extends AdapterBaseObjectForm {
    
    private String ra;
    private String cpf;
    private String situacao;
}