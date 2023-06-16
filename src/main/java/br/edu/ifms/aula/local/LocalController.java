package br.edu.ifms.aula.local;

import br.edu.ifms.arch.controller.AbstractBasicController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/local")
public class LocalController extends AbstractBasicController<Local, LocalDto, LocalForm, LocalRepository, LocalService, Long> {

    @Autowired
    @Override
    public void setService(LocalService service) {
        this.service = service;
        setMapper(LocalMapper.INSTANCE);
    }

    @Override
    public URI createUri(Local entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
