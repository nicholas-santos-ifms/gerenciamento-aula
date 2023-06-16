package br.edu.ifms.aula.estudante;

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
public class EstudanteDto extends AdapterBaseObjectDto {
    
    private String ra;
    private String cpf;
    private String situacao;
}