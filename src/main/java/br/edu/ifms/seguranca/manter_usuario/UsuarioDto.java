/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_usuario;

import br.edu.ifms.seguranca.manter_perfil.PerfilLeanDto;
import java.util.List;
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
public class UsuarioDto extends AbstractUsuarioDto {

    private TipoNotificacao tipoNotificacao;
    private List<PerfilLeanDto> perfis;

}
