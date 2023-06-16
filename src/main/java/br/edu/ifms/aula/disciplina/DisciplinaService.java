package br.edu.ifms.aula.disciplina;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService extends AbstractService
        <Disciplina, Long, DisciplinaForm, DisciplinaRepository> {

    @Autowired
    @Override
    public void setRepository(DisciplinaRepository repository) {
        super.repository = repository;
        super.setMapper(DisciplinaMapper.INSTANCE);
    }
}