package br.edu.ifms.aula.classe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class HorarioDto {

    private int sequencia;
    private ClasseDto classe;
    private int diaDaSemana;
    private String horaInicio;
    private String horaFim;
}