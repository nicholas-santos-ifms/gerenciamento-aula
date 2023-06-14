package br.edu.ifms.aula.periodo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodoService {
    @Autowired
    private PeriodoRepository repository;
    
    public List<Periodo> listar() {
        return repository.findAll();
    }
    
    public Periodo salvar(Periodo entity) {
        Periodo p = repository.save(entity);
        return p;
    }
    
    public Periodo atualizar(Long id, PeriodoForm form) {
        Periodo entity = buscarPorId(id);
        PeriodoMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Periodo buscarPorId(Long id) {
        Optional<Periodo> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Periodo para o código [%d] informado";
            throw new PeriodoNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Periodo entity = buscarPorId(id);
        repository.delete(entity);
    }
}