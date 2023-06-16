package br.edu.ifms.aula.estudante;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService 
        extends AbstractService<Estudante, Long, EstudanteForm, EstudanteRepository> {

    @Autowired
    @Override
    public void setRepository(EstudanteRepository repository) {
        super.repository = repository;
        super.setMapper(EstudanteMapper.INSTANCE);
    }
    
    
}