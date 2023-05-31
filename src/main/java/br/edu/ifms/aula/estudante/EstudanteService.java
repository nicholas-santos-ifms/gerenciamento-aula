package br.edu.ifms.aula.estudante;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository repository;
    
    public List<Estudante> listar() {
        return repository.findAll();
    }
    
    public Estudante salvar(Estudante entity) {
        Estudante p = repository.save(entity);
        return p;
    }
    
    public Estudante atualizar(Long id, EstudanteForm form) {
        Estudante entity = buscarPorId(id);
        EstudanteMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Estudante buscarPorId(Long id) {
        Optional<Estudante> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Estudante para o código [%d] informado";
            throw new EstudanteNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Estudante entity = buscarPorId(id);
        repository.delete(entity);
    }
}
