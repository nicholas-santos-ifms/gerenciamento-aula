/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Horario;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07041626105
 */
@Service
public class HorarioService {
     @Autowired
    private HorarioRepository repository;
    
    public List<Horario> listar() {
        return repository.findAll();
    }
    
    public Horario salvar(Horario entity) {
        Horario p = repository.save(entity);
        return p;
    }
    
    public Horario atualizar(Long id, HorarioForm form) {
        Horario entity = buscarPorId(id);
        HorarioMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public Horario buscarPorId(Long id) {
        Optional<Horario> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Disciplina para o código [%d] informado";
            throw new HorarioNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        Horario entity = buscarPorId(id);
        repository.delete(entity);
    }
}
