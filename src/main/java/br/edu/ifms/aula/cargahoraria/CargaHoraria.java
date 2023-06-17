/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.cargahoraria;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author 1513003
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "carga_horaria_sequence", name = "baseObjectSequence", allocationSize = 1)
public class CargaHoraria extends BaseObject {

    @Column(nullable = false)
    private Integer duracao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MedidaTempo medidaTempo;
}