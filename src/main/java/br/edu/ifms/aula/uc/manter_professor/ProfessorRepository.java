/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.uc.manter_professor;

import br.edu.ifms.arch.v010.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 1513003
 */
@Repository
public interface ProfessorRepository 
        extends IArchRepository<Professor, Long> {
    
}
