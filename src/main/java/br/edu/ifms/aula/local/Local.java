package br.edu.ifms.aula.local;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "local_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Local extends BaseObject {
    
}