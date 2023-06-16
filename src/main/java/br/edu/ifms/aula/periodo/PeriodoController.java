package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/periodo")
public class PeriodoController extends AbstractSimpleController<Periodo, Long, PeriodoDto, PeriodoForm, PeriodoRepository, PeriodoService> {

    @Autowired
    @Override
    public void setService(PeriodoService service) {
        super.service = service;
        super.setMapper(PeriodoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Periodo entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/periodo/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
