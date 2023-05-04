/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.professor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 1513003
 */
@RestController
@RequestMapping("/api/professor")
public class ProfessorController {
    
    @Autowired // faz o Spring criar uma instância de ProfessorRepository
    private ProfessorRepository repository;
    
    @GetMapping
    public ResponseEntity<List<ProfessorDto>> listar() {
        List<Professor> listaEntity = repository.findAll();
        List<ProfessorDto> listaDto = ProfessorMapper.INSTANCE.map(listaEntity);
        return ResponseEntity.ok(listaDto);
    }
    
}
