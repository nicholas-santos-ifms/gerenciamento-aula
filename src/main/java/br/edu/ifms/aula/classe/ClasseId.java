package br.edu.ifms.aula.classe;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
@Embeddable
public class ClasseId {
    
    @Column(name = "disciplina_id")
    private Long disciplinaId;
    
    @Column(name = "periodo_id")
    private Long periodoId;
    
    @Column(name = "turma_id")
    private Long turmaId;
}