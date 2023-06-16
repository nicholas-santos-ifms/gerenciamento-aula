package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.BaseObject;
import br.edu.ifms.aula.disciplina.Disciplina;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "campus_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Periodo extends BaseObject {
    
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