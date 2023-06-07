
package br.edu.ifms.aula.local;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@Builder
public class LocalDto {
       private Long id;
private String nome;
}
