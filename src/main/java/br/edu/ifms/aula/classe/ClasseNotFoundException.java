/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.classe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author 02709564173
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Classe não encontrada")

public class ClasseNotFoundException extends ResponseStatusException {

      public ClasseNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}
