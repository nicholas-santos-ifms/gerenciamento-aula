/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 1513003
 */
public interface DisciplinaRepository extends IArchRepository<Disciplina, Long> {
    
}
