
package br.edu.ifms.aula.cargaHoraria;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CargaHoraria {
    private Long id;
private String nome;
private int duracao;
private MedidaTempo MedidaTempo;
    
}
