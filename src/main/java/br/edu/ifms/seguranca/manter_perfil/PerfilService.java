package br.edu.ifms.seguranca.manter_perfil;

import br.edu.ifms.arch.v010.service.AbstractBasicService;
import br.edu.ifms.seguranca.manter_usuario.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santos
 */
@Service
public class PerfilService
        extends AbstractBasicService<Perfil, Long, PerfilForm, PerfilRepository> {

    @Autowired
    public UsuarioService usuarioService;

    @Autowired
    @Override
    public void setRepository(PerfilRepository repository) {
        super.repository = repository;
        super.setMapper(PerfilMapper.INSTANCE);
    }

    @Override
    public List<Perfil> listar() {        
        return repository.findAll();
    }
}
