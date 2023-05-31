package br.edu.ifms.aula.estudante;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Builder
public class EstudanteForm {
    private String nome;
    private String ra;
    private String cpf;
    private String situacao;
}
