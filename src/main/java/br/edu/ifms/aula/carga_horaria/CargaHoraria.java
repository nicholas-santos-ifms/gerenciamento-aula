package br.edu.ifms.aula.carga_horaria;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
             
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "cargaHoraria_sequence", name = "baseObjectSequence", allocationSize = 1)
public class CargaHoraria extends BaseObject {
    
    private Integer duracao;
    private MedidaTempo medidaTempo;
}
