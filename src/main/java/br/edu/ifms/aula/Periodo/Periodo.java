/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Periodo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author 03569198200
 */
@Entity // Cria uma tabela no SGBD com o mesmo nome da classe
@Data // Implementa os métodos GET e SET para cada atributo
@EqualsAndHashCode // Cria os métodos equals e hashCode que é utilizado para comparação
@AllArgsConstructor // cria construtores com todos os atributos
@NoArgsConstructor // cria construtor sem parâmetros
@Builder // padrão de projeto para construção de objetos
public class Periodo implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Column(columnDefinition = "varchar(255) not null")

    private String nome;
    @Column(columnDefinition = "varchar(255) not null")

    @Enumerated(EnumType.STRING)
    private TipoPeriodo tipoPeriodo;

    @Column(columnDefinition = "int not null")
    private int numero;

    @Column(columnDefinition = "int not null")
    private int ano;

    @Column(columnDefinition = "time with time zone not null")
    private LocalDate inicio;

    @Column(columnDefinition = "time with time zone not null")
    private LocalDate fim;

}
