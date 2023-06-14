/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.turma;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TurmaRepository extends IArchRepository<Turma, Long>{
    
}
