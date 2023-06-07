
package br.edu.ifms.aula.cargaHoraria;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@Builder
public class CargaHorariaDto {
    private Long id;
private String nome;
private int duracao;
private MedidaTempo MedidaTempo;
}
