package br.edu.ifms.aula.disciplina;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Disciplina não encontrado")
public class DisciplinaNotFoundException extends ResponseStatusException {

    public DisciplinaNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}