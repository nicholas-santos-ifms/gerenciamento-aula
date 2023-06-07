
package br.edu.ifms.aula.local;

import br.edu.ifms.aula.cargaHoraria.CargaHoraria;
import br.edu.ifms.aula.cargaHoraria.CargaHorariaForm;
import br.edu.ifms.aula.cargaHoraria.CargaHorariaMapper;
import br.edu.ifms.aula.cargaHoraria.CargaHorariaNotFoundException;
import br.edu.ifms.aula.cargaHoraria.CargaHorariaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class LocalService {
    @Autowired
    private CargaHorariaRepository repository;
    
    
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
