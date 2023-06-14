/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.dto.AdapterBaseObjectForm;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data

public class TurmaForm extends AdapterBaseObjectForm{
    @Min(1)
    private int ano;
    
    @NonNull
    private CursoDto curso;
}
