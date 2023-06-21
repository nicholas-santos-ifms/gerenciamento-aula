/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.disciplina;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author valti
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Disciplina não encontrada")

public class DisciplinaNotFoundException extends ResponseStatusException {

      public DisciplinaNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}
