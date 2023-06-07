package br.edu.ifms.aula.classe;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ClasseForm {
    private int vagas;
    private int numeroAulas;
    private LocalDate inicio;
}
