
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampusService extends AbstractBasicService<Campus, Long, CampusForm, CampusRepository> {

    @Autowired
    @Override
    public void setRepository(CampusRepository repository) {
        super.repository = repository;
        setMapper(CampusMapper.INSTANCE);
    }
}
