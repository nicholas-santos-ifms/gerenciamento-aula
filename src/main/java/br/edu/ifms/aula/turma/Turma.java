package br.edu.ifms.aula.turma;

import br.edu.ifms.aula.estudante.Estudante;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@Data // Implementa os métodos GET e SET para cada atributo
@EqualsAndHashCode // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
@Builder // padrão de projeto para construção de objetos
public class Turma implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private int ano;
        @ManyToOne
        private List<Estudante> listaEstudantes;
}
