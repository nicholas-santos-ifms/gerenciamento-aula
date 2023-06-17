package br.edu.ifms.aula.carga_horaria;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/carga-horaria")
public class CargaHorariaController extends AbstractSimpleController<CargaHoraria, Long, CargaHorariaDto, CargaHorariaForm, CargaHorariaRepository, CargaHorariaService> {

    @Autowired
    @Override
    public void setService(CargaHorariaService service) {
        super.service = service;
        super.setMapper(CargaHorariaMapper.INSTANCE);
    }

    @Override
    public URI createUri(CargaHoraria entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/carga-horaria/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}
