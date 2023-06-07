package br.edu.ifms.aula.periodo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Periodo nao encontrado")
public class PeriodoNotFoundException extends ResponseStatusException {

    public PeriodoNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
}}
