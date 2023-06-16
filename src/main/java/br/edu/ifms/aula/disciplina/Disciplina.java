package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.curso.Curso;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Disciplina {
    @Id
    @GeneratedValue(generator = "disciplina_sequence")
    private Long id;
    private String nome;
    private Double cargaHoraria;
    private String ementa;
    
    @ManyToOne
    private Curso curso;
}