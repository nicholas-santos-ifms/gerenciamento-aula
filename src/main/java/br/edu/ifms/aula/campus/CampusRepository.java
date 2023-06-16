
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusRepository extends IArchRepository<Campus, Long> {
    
}
