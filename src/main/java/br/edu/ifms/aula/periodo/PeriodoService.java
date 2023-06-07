<<<<<<< HEAD
package br.edu.ifms.aula.periodo;

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import br.edu.ifms.aula.disciplina.*;
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
/**
 *
 * @author 1513003
 */
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
@Service
public class PeriodoService {
    @Autowired
    private PeriodoRepository repository;
    
    public List<Periodo> listar() {
        return repository.findAll();
    }
    
    public Periodo salvar(Periodo entity) {
<<<<<<< HEAD
    	Periodo p = repository.save(entity);
=======
        Periodo p = repository.save(entity);
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
        return p;
    }
    
    public Periodo atualizar(Long id, PeriodoForm form) {
<<<<<<< HEAD
    	Periodo entity = buscarPorId(id);
    	PeriodoMapper.INSTANCE.update(form, entity);
=======
        Periodo entity = buscarPorId(id);
        PeriodoMapper.INSTANCE.update(form, entity);
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
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
<<<<<<< HEAD
    	Periodo entity = buscarPorId(id);
=======
        Periodo entity = buscarPorId(id);
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
        repository.delete(entity);
    }
}
