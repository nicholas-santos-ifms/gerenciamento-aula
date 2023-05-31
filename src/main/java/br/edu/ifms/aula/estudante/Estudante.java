package br.edu.ifms.aula.estudante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class Estudante {
  @Id
  @GeneratedValue
  private Long id;
  private String nome;
  private String cpf;
  private String ra;
  private String situacao;
}
