package br.edu.ifms.aula.carga_horaria;

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
public class CargaHorariaDto extends AdapterBaseObjectDto {
    
    private Integer duracao;
    private MedidaTempo medidaTempo;
}
