package br.edu.ifms.aula.local;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends IArchRepository<Local, Long> {
    
}