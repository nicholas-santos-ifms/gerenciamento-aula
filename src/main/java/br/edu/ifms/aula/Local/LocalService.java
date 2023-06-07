/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Local;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class LocalService {
    @Autowired
    private LocalRepository repository;
    
    public List<Local> listar() {
        return repository.findAll();
    }
    
    public Local salvar(Local entity) {
        Local p = repository.save(entity);
        return p;
    }
    
    public Local atualizar(Long id, LocalForm form) {
        Local entity = buscarPorId(id);
        LocalMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Local buscarPorId(Long id) {
        Optional<Local> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Local para o código [%d] informado";
            throw new LocalNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Local entity = buscarPorId(id);
        repository.delete(entity);
    }
}
