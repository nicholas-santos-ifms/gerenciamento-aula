package br.edu.ifms.aula.local;

import br.edu.ifms.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalService extends AbstractBasicService<Local, Long, LocalForm, LocalRepository> {

    @Autowired
    @Override
    public void setRepository(LocalRepository repository) {
        super.repository = repository;
        setMapper(LocalMapper.INSTANCE);
    }
}