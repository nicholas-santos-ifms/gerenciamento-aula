package br.edu.ifms.aula.turma;
import br.edu.ifms.arch.controller.AbstractSimpleController;
import java.net.URI;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/turma")
public class TurmaController extends AbstractSimpleController <Turma,Long,TurmaDto,TurmaForm,TurmaRepository,TurmaService>{

    @Override
    public void setService(TurmaService service) {
        super.service = service;
        super.setMapper(TurmaMapper.INSTANCE);
    }
    
    @Override
    public URI createUri(Turma entity, UriComponentsBuilder uriBuilder){
        return uriBuilder.path("/api/turma/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}
