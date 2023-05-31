/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.turma;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 02709564173
 */
public class TurmaService {
    @Autowired
    private TurmaRepository repository;
    
    public List<Turma> listar(){
        return repository.findAll();
    }
    public Turma salvar(Turma entity) {
        Turma p = repository.save(entity);
        return p;
    }
    public Turma atualizar(Long id, TurmaForm form) throws TurmaNotFoundException {
        Turma entity = buscarPorId(id);
        TurmaMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Turma buscarPorId(Long id) throws TurmaNotFoundException {
        Optional<Turma> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Turma para o código [%d] informado";
            throw new TurmaNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) throws TurmaNotFoundException {
        Turma entity = buscarPorId(id);
        repository.delete(entity);
    }
}
