
package br.edu.ifms.aula.cargaHoraria;

import br.edu.ifms.aula.CargaHoraria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CargaHorariaRepository extends JpaRepository<CargaHoraria, Long>{

    List<br.edu.ifms.aula.cargaHoraria.CargaHoraria> findAll();
    
}
