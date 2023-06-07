<<<<<<< HEAD
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
package br.edu.ifms.aula.periodo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

<<<<<<< HEAD
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Periodo nao encontrado")
=======
/**
 *
 * @author 1513003
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Periodo não encontrado")
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
public class PeriodoNotFoundException extends ResponseStatusException {

    public PeriodoNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
<<<<<<< HEAD
}}
=======
    }
    
}
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
