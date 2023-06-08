/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.Periodo;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author 07041626105
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "campus_sequence", name = "baseObjectSequence", allocationSize = 1)

public class Periodo extends BaseObject{

    @Column(columnDefinition = "varchar(255) not null")
    @Enumerated(EnumType.STRING)
    private TipoPeriodo tipoPeriodo;

    @Column(columnDefinition = "int not null")
    private Integer numero;

    @Column(columnDefinition = "int not null")
    private Integer ano;

    @Column(columnDefinition = "time with time zone not null")
    private LocalDate inicio;

    @Column(columnDefinition = "time with time zone not null")
    private LocalDate fim;
}
