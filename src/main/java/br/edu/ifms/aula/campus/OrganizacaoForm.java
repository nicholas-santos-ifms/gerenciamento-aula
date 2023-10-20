/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.v010.dto.AdapterBaseObjectForm;
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
 * @author nicho
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrganizacaoForm extends AdapterBaseObjectForm {
    
    @NotEmpty(message = "A SIGLA não pode ser vazia")
    @NotBlank(message = "A SIGLA não pode ser composta somente de espaços vazios")
    @NotNull(message = "A SIGLA deve ser informada")
    private String sigla;
    
    private OrganizacaoLeanDto organizacaoPai;
}
