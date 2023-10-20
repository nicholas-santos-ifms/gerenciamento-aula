package br.edu.ifms.seguranca.manter_perfil;

import br.edu.ifms.arch.v010.BaseObject;
import br.edu.ifms.seguranca.manter_menu.Menu;
import br.edu.ifms.seguranca.manter_usuario.Usuario;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import org.springframework.security.core.GrantedAuthority;

//@EntityListeners(AuditoriaListener.class)
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@SequenceGenerator(sequenceName = "perfil_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Perfil extends BaseObject implements GrantedAuthority {

    @ManyToMany(
            targetEntity = Menu.class,
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "perfil_menus",
            joinColumns = @JoinColumn(name = "perfil_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id"))
    private List<Menu> menus;
    
    @ManyToMany(mappedBy = "perfis", 
            targetEntity = Menu.class,
            fetch = FetchType.LAZY)
    private List<Usuario> usuarios;
    
    @Override
    public String getAuthority() {
        return super.getNome();
    }

    @Override
    public String toString() {
        return super.getNome();
    }
}
