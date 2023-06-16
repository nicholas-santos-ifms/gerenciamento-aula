package br.edu.ifms.aula.local;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LocalDto extends AdapterBaseObjectDto {
    
}