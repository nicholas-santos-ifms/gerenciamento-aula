package br.edu.ifms.aula.carga_horaria;

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
public class CargaHorariaForm extends AdapterBaseObjectForm {
    
    private Integer duracao;
    private MedidaTempo medidaTempo;
}
