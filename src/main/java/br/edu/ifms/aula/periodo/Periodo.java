<<<<<<< HEAD
package br.edu.ifms.aula.periodo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.periodo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
=======
/**
 *
 * @author 1513003
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
public class Periodo {
    
    @Id
    @GeneratedValue
    private Long id;
<<<<<<< HEAD
    @NotNull
    @NotEmpty
    @NotBlank
    private String nome;
    
    private TipoPeriodo tipoPeriodo;
    @NotNull
    @Min(1)
    private int numero;
    @NotNull
    @Positive
    private int ano;
    @NotNull
    private LocalDate inicio;
    @NotNull
    private LocalDate fim;
    
=======
    
    @Column(columnDefinition = "varchar(255) not null")
    private String nome;
    
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
>>>>>>> bd863591567585f145c663c8d1feae69d30f0c4b
}
