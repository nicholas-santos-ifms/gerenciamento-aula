
package br.edu.ifms.aula.campus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Campus não encontrado")
public class CampusNotFoundException extends ResponseStatusException {

    public CampusNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}
