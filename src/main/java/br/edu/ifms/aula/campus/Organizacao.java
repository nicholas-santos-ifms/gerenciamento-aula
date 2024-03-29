/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.campus;

import br.edu.ifms.arch.v010.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author nicholas.santos
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "organizacao_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Organizacao extends BaseObject {
    
    private String sigla;
    
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "organizacao_pai_id", referencedColumnName = "id", table = "organizacao")
    private Organizacao organizacaoPai;
}
