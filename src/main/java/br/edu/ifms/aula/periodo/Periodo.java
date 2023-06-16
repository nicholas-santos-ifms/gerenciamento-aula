package br.edu.ifms.aula.periodo;

import br.edu.ifms.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@SequenceGenerator (sequenceName = "", name = "", allocationSize = 1)
public class Periodo extends BaseObject {
    
    @Id
    @GeneratedValue
    private Long id;
    @Column (columnDefinition = "Varchar (255) not null")
    private String nome;
    @Column (columnDefinition = "Varchar (255) not null")
    private TipoPeriodo tipoPeriodo;
    @Column (columnDefinition = "int not null")
    private int numero;
    @Column (columnDefinition = "int not null")
    private int ano;
    @Column (columnDefinition = "time with time zone not null")
    private LocalDate inicio;
    @Column (columnDefinition = "time with time zone not null")
    private LocalDate fim;
    
}
