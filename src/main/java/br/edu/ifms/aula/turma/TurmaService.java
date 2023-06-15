package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TurmaService extends AbstractService<Turma, Long, TurmaForm, TurmaRepository>{
    @Autowired
    @Override
    public void setRepository(TurmaRepository repository) {
        super.repository = repository;
        super.setMapper(TurmaMapper.INSTANCE);
    }
   
}
