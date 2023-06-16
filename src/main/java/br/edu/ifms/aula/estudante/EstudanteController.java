package br.edu.ifms.aula.estudante;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/estudante")
public class EstudanteController 
        extends AbstractSimpleController<Estudante, Long, EstudanteDto, EstudanteForm, EstudanteRepository, EstudanteService>  {

    @Autowired
    @Override
    public void setService(EstudanteService service) {
        super.service = service;
        super.setMapper(EstudanteMapper.INSTANCE);
    }

    @Override
    public URI createUri(Estudante entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/estudante/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}