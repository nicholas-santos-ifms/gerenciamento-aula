package br.edu.ifms.seguranca.manter_perfil;

import br.edu.ifms.arch.v010.controller.AbstractLeanController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author santos
 */
@RestController
@RequestMapping("/api/perfil")
@Profile(value = {"prod", "dev", "test"})
public class PerfilController 
        extends AbstractLeanController<
            Perfil, 
            Long, 
            PerfilDto, 
            PerfilLeanDto, 
            PerfilForm, 
            PerfilRepository, 
            PerfilService> {

    @Autowired
    @Override
    public void setService(PerfilService service) {
        super.service = service;
        super.setMapper(PerfilMapper.INSTANCE);
    }

    @Override
    public URI createUri(Perfil entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/perfil/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
