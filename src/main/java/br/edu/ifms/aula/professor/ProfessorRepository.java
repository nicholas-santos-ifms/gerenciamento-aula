/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.professor;

import br.edu.ifms.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author 07041626105
 */
@Repository
public interface ProfessorRepository  extends IArchRepository<Professor, Long>{
    
}