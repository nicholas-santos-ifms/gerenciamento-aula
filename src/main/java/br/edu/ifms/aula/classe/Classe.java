package br.edu.ifms.aula.classe;

import br.edu.ifms.aula.disciplina.Disciplina;
import br.edu.ifms.aula.periodo.Periodo;
import br.edu.ifms.aula.turma.Turma;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
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
public class Classe implements Serializable {

    @EmbeddedId
    private ClasseId id;
    
    @ManyToOne
    @JoinColumn(name = "disciplina_id",
            insertable = false,
            updatable = false)
    private Disciplina disciplina;
    
    @ManyToOne
    @JoinColumn(name = "periodo_id",
            insertable = false,
            updatable = false)
    private Periodo periodo;
    
    @ManyToOne
    @JoinColumn(name = "turma_id",
            insertable = false,
            updatable = false)
    private Turma turma;
    
    @Column(nullable = false)
    private Integer vagas;
    
    @Column(nullable = false)
    private Integer numeroAulas;
    
    @Column(nullable = false)
    private LocalDate inicio;
    
    @OneToMany(mappedBy = "id.classe",
            fetch = FetchType.LAZY,
            cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST },
            orphanRemoval = true)
    private List<Horario> horarios;
}