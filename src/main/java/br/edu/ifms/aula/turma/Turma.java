package br.edu.ifms.aula.turma;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@SequenceGenerator(sequenceName = "turma sequencia",nome = "baseObjectSequence",allocationSinze =1)
@EqualsAndHashCode // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
@Builder // padrão de projeto para construção de objetos
public class Turma implements Serializable {
	@SuperBuilder
        
	private Long id;
	private String nome;
	private int ano;
}
