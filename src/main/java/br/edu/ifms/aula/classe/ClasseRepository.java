package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends IArchRepository<Classe, ClasseId> {
    
}