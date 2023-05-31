package br.edu.ifms.aula.estudante;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Estudante não encontrado")
public class EstudanteNotFoundException extends ResponseStatusException{
  
  public EstudanteNotFoundException(String errorMessage) {
    super(HttpStatus.NOT_FOUND, errorMessage);
  }
}
