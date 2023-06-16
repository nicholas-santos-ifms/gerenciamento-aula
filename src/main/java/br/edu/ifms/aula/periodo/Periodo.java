/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
=======
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

<<<<<<< HEAD
=======
/**
 *
 * @author 1513003
 */
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
<<<<<<< HEAD
@SequenceGenerator(sequenceName = "campus_sequence", name = "baseObjectSequence", allocationSize = 1)

public class Periodo extends BaseObject {
    
    @Id
    
    @GeneratedValue
    private Long id;
    
    private String nome;
    @Enumerated(enumType.STRING)
    //private String TipoPeriodo tipoPeriodo;
=======
@SequenceGenerator(sequenceName = "periodo_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Periodo extends BaseObject {
    
    @Column(columnDefinition = "varchar(255) not null")
    @Enumerated(EnumType.STRING)
    private TipoPeriodo tipoPeriodo;
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
    
    @Column(columnDefinition = "int not null")
    private Integer numero;
    
    @Column(columnDefinition = "int not null")
    private Integer ano;
    
<<<<<<< HEAD
    @Column(columnDefinition = "time with time zone not null")
    private LocalDate inicio;
    
    @Column(columnDefinition = "int not null")
    private LocalDate fim;
    
=======
    @Column(nullable = false)
    private LocalDate inicio;
    
    @Column(nullable = false)
    private LocalDate fim;
>>>>>>> 6a6eebfa1b3264c67960703a629afdf1f67a6364
}
