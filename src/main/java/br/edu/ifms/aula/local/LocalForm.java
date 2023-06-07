
package br.edu.ifms.aula.local;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Builder
public class LocalForm {
    private Long id;
private String nome;
}
