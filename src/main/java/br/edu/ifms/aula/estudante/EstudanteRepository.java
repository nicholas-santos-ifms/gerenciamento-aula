package br.edu.ifms.aula.estudante;

import br.edu.ifms.aula.disciplina.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Disciplina, Long> {

    public Estudante save(Estudante entity);

    public void delete(Estudante entity);
    
}
