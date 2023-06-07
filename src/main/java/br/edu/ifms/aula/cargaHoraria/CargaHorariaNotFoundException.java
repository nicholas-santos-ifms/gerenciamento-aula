package br.edu.ifms.aula.cargaHoraria;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "CargaHoraria não encontrado")
public class CargaHorariaNotFoundException extends ResponseStatusException {

    public CargaHorariaNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}
