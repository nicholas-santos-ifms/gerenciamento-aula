
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.aula.cargaHoraria.CargaHoraria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    public Disciplina save(CargaHoraria entity);
    
}
