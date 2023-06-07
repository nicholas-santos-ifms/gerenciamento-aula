/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.cargaHoraria;

import br.edu.ifms.aula.disciplina.CargaHoraria;
import br.edu.ifms.aula.disciplina.CargaHorariaForm;
import br.edu.ifms.aula.disciplina.CargaHorariaMapper;
import br.edu.ifms.aula.disciplina.CargaHorariaNotFoundException;
import br.edu.ifms.aula.disciplina.CargaHorariaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

class CargaHorariaService {
    @Autowired
    private CargaHorariaRepository repository;
    
    public List<CargaHoraria> listar() {
        return repository.findAll();
    }
    
    public CargaHoraria salvar(CargaHoraria entity) {
        CargaHoraria p = repository.save(entity);
        return p;
    }
    
    public CargaHoraria atualizar(Long id, CargaHorariaForm form) {
        CargaHoraria entity = buscarPorId(id);
        CargaHorariaMapper.INSTANCE.update(form, entity);
        return entity;
    }
    
    public CargaHoraria buscarPorId(Long id) {
        Optional<CargaHoraria> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe CargaHoraria para o código [%d] informado";
            throw new CargaHorariaNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }

    public void excluir(Long id) {
        CargaHoraria entity = buscarPorId(id);
        repository.delete(entity);
    }

    List<CargaHoraria> listar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
