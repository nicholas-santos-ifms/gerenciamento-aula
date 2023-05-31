/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.curso;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.aula.campus.Campus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author nicho
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "curso_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Curso extends BaseObject {
    
    @ManyToOne
    private Campus campus;
    
<<<<<<< HEAD
<<<<<<< HEAD
    private List<Diciplina> disciplinas;
=======
>>>>>>> 491b825186552017160008d38eb80bf829b96243
=======
>>>>>>> c5298ebcd07548d8d53ce9db01b292b7792cfde9
}
