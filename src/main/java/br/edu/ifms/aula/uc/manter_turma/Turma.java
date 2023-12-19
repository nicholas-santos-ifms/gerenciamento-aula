package br.edu.ifms.aula.uc.manter_turma;

import br.edu.ifms.arch.v010.BaseObject;
import br.edu.ifms.aula.curso.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
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
@SuperBuilder // padrão de projeto para construção de objetos
public class Turma extends BaseObject {

    @Column(columnDefinition = "integer not null")
    private int ano;
    
    @ManyToOne
    private Curso curso;
}
