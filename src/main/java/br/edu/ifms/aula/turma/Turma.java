package br.edu.ifms.aula.turma;

<<<<<<< HEAD
import br.edu.ifms.aula.estudante.Estudante;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;
=======
import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.aula.curso.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
>>>>>>> 0fd01f349779d75c94826407415d1a2b3cd97a1d
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@SequenceGenerator(sequenceName = "turma_sequence", name = "baseObjectSequence", allocationSize = 1)
@Data // Implementa os métodos GET e SET para cada atributo
@EqualsAndHashCode(callSuper = true) // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
<<<<<<< HEAD
@Builder // padrão de projeto para construção de objetos
public class Turma implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int ano;
        @ManyToOne
        private List<Estudante> listaEstudantes;
=======
@SuperBuilder // padrão de projeto para construção de objetos
public class Turma extends BaseObject {

    @Column(columnDefinition = "integer not null")
    private int ano;
    
    @ManyToOne
    private Curso curso;
>>>>>>> 0fd01f349779d75c94826407415d1a2b3cd97a1d
}
