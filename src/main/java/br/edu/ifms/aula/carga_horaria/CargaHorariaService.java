package br.edu.ifms.aula.carga_horaria;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CargaHorariaService extends AbstractService<CargaHoraria, Long, CargaHorariaForm, CargaHorariaRepository> {

    @Autowired
    @Override
    public void setRepository(CargaHorariaRepository repository) {
        super.repository = repository;
        super.setMapper(CargaHorariaMapper.INSTANCE);
    }
}
