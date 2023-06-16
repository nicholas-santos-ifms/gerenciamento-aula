package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodoService extends AbstractService<Periodo, Long, PeriodoForm, PeriodoRepository> {

    @Autowired
    @Override
    public void setRepository(PeriodoRepository repository) {
        super.repository = repository;
        super.setMapper(PeriodoMapper.INSTANCE);
    }
}
