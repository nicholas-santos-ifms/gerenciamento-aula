package br.edu.ifms.aula.uc.manter_perfil;

import br.edu.ifms.aula.uc.manter_menu.MenuLeanDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author santos
 */
@Getter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class PerfilDto extends AbstractPerfilDto {
    
    private List<MenuLeanDto> menus;
}
