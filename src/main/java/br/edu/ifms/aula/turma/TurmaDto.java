<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import br.edu.ifms.aula.curso.CursoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
=======
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364

@Getter
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD


public class TurmaDto extends AdapterBaseObjectDto {
    
=======
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class TurmaDto extends AdapterBaseObjectDto {

>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
    private int ano;
    private String nomeCurso;
    private String nomeCampus;
}
