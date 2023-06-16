<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NonNull;
=======
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import br.edu.ifms.aula.curso.CursoDto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
<<<<<<< HEAD

public class TurmaForm extends AdapterBaseObjectForm{
    @Min(1)
    private int ano;
    
    @NonNull
    private CursoDto curso;
=======
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TurmaForm extends AdapterBaseObjectForm {

    @Min(1)
    private int ano;
    
    @NotNull
    private CursoDto curso;

>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
}
