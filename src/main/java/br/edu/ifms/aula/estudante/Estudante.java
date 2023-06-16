package br.edu.ifms.aula.estudante;

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
@SequenceGenerator(sequenceName = "estudante_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Estudante extends BaseObject {

    private String ra;
    private String cpf;
    private String situacao;
}