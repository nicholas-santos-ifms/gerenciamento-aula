/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_professor;

import br.edu.ifms.seguranca.manter_usuario.UsuarioForm;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 1513003
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorForm extends UsuarioForm {
    
    @NotEmpty(message = "O SIAPE não deve ser vazio.")
    @NotNull(message = "O SIAPE deve ser informado.")
    @NotBlank(message = "O SIAPE não deve conter somente espaços em branco")
    private String siape;
}
