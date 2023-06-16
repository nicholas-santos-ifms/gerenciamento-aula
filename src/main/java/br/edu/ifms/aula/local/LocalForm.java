package br.edu.ifms.aula.local;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LocalForm extends AdapterBaseObjectForm {
    
}