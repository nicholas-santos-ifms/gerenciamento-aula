/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_usuario;

import br.edu.ifms.arch.v010.dto.AdapterBaseObjectDto;
import br.edu.ifms.seguranca.manter_arquivo.ArquivoDto;
import br.edu.ifms.seguranca.types.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author santos
 */
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractUsuarioDto
        extends AdapterBaseObjectDto {
    
    private ArquivoDto foto;
    private String celular;
    private String email;
    private Status status;
    private Boolean enabled;
    private TipoNotificacao tipoNotificacao;

}
