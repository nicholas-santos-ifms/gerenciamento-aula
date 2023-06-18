/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.estudante;

<<<<<<< HEAD:src/main/java/br/edu/ifms/aula/estudante/Estudante.java
import br.edu.ifms.aula.turma.Turma;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
=======
import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
>>>>>>> 0fd01f349779d75c94826407415d1a2b3cd97a1d:src/main/java/br/edu/ifms/aula/Estudante/Estudante.java
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
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
    @ManyToOne
    private Turma turma;
}
