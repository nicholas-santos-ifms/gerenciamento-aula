<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
=======
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService extends AbstractService
        <Turma, Long, TurmaForm, TurmaRepository> {
<<<<<<< HEAD
    
=======

>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
    @Autowired
    @Override
    public void setRepository(TurmaRepository repository) {
        super.repository = repository;
<<<<<<< HEAD
        super.setMapper( TurmaMapper.INSTANCE);
    }
=======
        super.setMapper(TurmaMapper.INSTANCE);
    }

    
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
}
