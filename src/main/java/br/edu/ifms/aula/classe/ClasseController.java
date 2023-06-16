package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/classe")
public class ClasseController extends AbstractSimpleController<Classe, ClasseId, ClasseDto, ClasseForm, ClasseRepository, ClasseService> {

    @Autowired
    @Override
    public void setService(ClasseService service) {
        super.service = service;
        super.setMapper(ClasseMapper.INSTANCE);
    }

    @Override
    public URI createUri(Classe entity, UriComponentsBuilder uriBuilder) {
        Map<String, Long> map = new HashMap();
        var id = entity.getId();
        map.put("disciplinaId", id.getDisciplinaId());
        map.put("turmaId", id.getTurmaId());
        map.put("periodoId", id.getPeriodoId());
        return uriBuilder.path("/api/classe/{disciplinaId}/{turmaId}/{periodoId}")
                .buildAndExpand(map)
                .toUri();
    }
    
    
}