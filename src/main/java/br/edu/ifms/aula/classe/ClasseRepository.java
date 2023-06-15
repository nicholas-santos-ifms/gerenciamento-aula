/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.classe;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 1513003
 */
@Repository
public interface ClasseRepository extends IArchRepository<Classe, ClasseId> {
    
}
