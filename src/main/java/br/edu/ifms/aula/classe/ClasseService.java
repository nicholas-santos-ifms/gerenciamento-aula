package br.edu.ifms.aula.classe;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseService {
    @Autowired
    private ClasseRepository repository;
    
    public List<Classe> listar() {
        return repository.findAll();
    }
    
    public Classe salvar(Classe entity) {
    	Classe p = repository.save(entity);
        return p;
    }
    
    public Classe atualizar(Long id, ClasseForm form) {
    	Classe entity = buscarPorId(id);
    	ClasseMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Classe buscarPorId(Long id) {
        Optional<Classe> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Classe para o código [%d] informado";
            throw new ClasseNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
    	Classe entity = buscarPorId(id);
        repository.delete(entity);
    }
}
