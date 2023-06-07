/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/CargaHorarias/Class.java to edit this template
 */
package br.edu.ifms.aula.cargaHoraria;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author 02709564173
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "CargaHoraria não encontrada")

public class CargaHorariaNotFoundException extends ResponseStatusException {

      public CargaHorariaNotFoundException(String errorMessage){
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
    
}