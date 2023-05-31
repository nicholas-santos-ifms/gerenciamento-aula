package br.edu.ifms.aula.estudante;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Builder
public class EstudanteForm {

  private String nome;
  private String cpf;
  private String ra;
  private String situacao;

  private EstudanteDto estudante;
  
}
