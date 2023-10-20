package br.edu.ifms.seguranca.manter_perfil;

import br.edu.ifms.arch.v010.dto.AdapterBaseObjectForm;
import br.edu.ifms.seguranca.manter_menu.MenuLeanDto;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author santos
 */
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PerfilForm
        extends AdapterBaseObjectForm {

    private List<MenuLeanDto> menus;
}
