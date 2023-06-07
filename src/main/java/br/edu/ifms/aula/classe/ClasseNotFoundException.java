package br.edu.ifms.aula.classe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Classe nao encontrada")
public class ClasseNotFoundException extends ResponseStatusException {

    public ClasseNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
}}
