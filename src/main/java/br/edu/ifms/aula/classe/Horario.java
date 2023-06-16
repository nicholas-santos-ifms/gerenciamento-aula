package br.edu.ifms.aula.classe;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Horario {
    
    @EmbeddedId
    private HorarioId id;
    
    @Column(nullable = false)
    private int diaDaSemana;
    
    @Column(nullable = false)
    private String horaInicio;
    
    @Column(nullable = false)
    private String horaFim;
}