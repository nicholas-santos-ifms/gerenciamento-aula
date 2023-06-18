package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD


=======
import org.springframework.web.util.UriComponentsBuilder;
>>>>>>> 0fd01f349779d75c94826407415d1a2b3cd97a1d

/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/turma")
public class TurmaController extends AbstractSimpleController
        <Turma, Long, TurmaDto, TurmaForm, TurmaRepository, TurmaService> {

    @Autowired
    @Override
    public void setService(TurmaService service) {
        super.service = service;
        super.setMapper(TurmaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Turma entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/api/turma/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
