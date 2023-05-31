/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;


import br.edu.ifms.aula.disciplina.Diciplina;
import br.edu.ifms.aula.disciplina.DiciplinaForm;
import br.edu.ifms.aula.disciplina.DiciplinaMapper;
import br.edu.ifms.aula.disciplina.DiciplinaNotFoundException;
import br.edu.ifms.aula.disciplina.DiciplinaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class DiciplinaService {
    
    @Autowired
    private DiciplinaRepository repository;
    
    public List<Diciplina> listar() {
        return repository.findAll();
    }
    
    public Diciplina salvar(Diciplina entity) {
        Diciplina p = repository.save(entity);
        return p;
    }
    
    public Diciplina atualizar(Long id, DiciplinaForm form) {
        Diciplina entity = buscarPorId(id);
        DiciplinaMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Diciplina buscarPorId(Long id) {
        Optional<Diciplina> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Diciplina para o código [%d] informado";
            throw new DiciplinaNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Diciplina entity = buscarPorId(id);
        repository.delete(entity);
    }
}
