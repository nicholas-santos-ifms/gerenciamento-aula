package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD


=======
>>>>>>> 0fd01f349779d75c94826407415d1a2b3cd97a1d
@Service
public class TurmaService extends AbstractService
        <Turma, Long, TurmaForm, TurmaRepository> {

    @Autowired
    @Override
    public void setRepository(TurmaRepository repository) {
        super.repository = repository;
        super.setMapper(TurmaMapper.INSTANCE);
    }

    
}
