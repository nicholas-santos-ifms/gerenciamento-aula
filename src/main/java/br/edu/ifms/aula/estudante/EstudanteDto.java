package br.edu.ifms.aula.estudante;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@Builder
public class EstudanteDto {
  
  private Long id;
  private String nome;
  private String cpf;
  private String ra;
  private String situacao;
}
