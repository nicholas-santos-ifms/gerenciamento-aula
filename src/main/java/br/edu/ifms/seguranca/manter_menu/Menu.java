/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_menu;

import br.edu.ifms.seguranca.manter_submenu.Submenu;
import br.edu.ifms.arch.v010.BaseObject;
import br.edu.ifms.seguranca.manter_perfil.Perfil;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author santos
 */
//@EntityListeners(AuditoriaListener.class)
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(sequenceName = "menu_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Menu extends BaseObject implements Serializable {

    @Column(columnDefinition = "boolean default true")
    private Boolean disponivel;
    
    @ManyToMany(mappedBy = "menus", 
            targetEntity = Perfil.class,
            fetch = FetchType.LAZY)
    private List<Perfil> perfis;
    
    @ManyToMany(
            targetEntity = Submenu.class,
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "menu_submenus",
            joinColumns = @JoinColumn(name = "menu_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "submenu_id", referencedColumnName = "id"))
    private List<Submenu> submenus;

}
