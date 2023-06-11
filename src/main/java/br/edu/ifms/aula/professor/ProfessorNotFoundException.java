/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.professor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author 07041626105
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Professor não encontrada")

public class ProfessorNotFoundException extends ResponseStatusException {

      public ProfessorNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}