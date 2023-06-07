
package br.edu.ifms.aula.local;

import br.edu.ifms.aula.Local;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocalRepository extends JpaRepository<Local, Long> {
    
}
