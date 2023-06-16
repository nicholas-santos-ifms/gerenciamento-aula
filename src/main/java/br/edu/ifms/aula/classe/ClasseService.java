package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseService extends AbstractService<Classe, ClasseId, ClasseForm, ClasseRepository> {

    @Autowired
    @Override
    public void setRepository(ClasseRepository repository) {
        super.repository = repository;
        super.setMapper(ClasseMapper.INSTANCE);
    }
}