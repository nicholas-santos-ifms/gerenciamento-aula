/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.professor;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 1513003
 */
public interface ProfessorRepository 
        extends JpaRepository<Professor, Long> {
    
}
