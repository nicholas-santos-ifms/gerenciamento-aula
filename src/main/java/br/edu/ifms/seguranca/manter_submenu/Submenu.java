/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_submenu;

import br.edu.ifms.arch.v010.BaseObject;
import br.edu.ifms.seguranca.manter_menu.Menu;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@SequenceGenerator(sequenceName = "submenu_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Submenu extends BaseObject implements Serializable {
    
    @Column(nullable = false)
    private String endereco;
    
    private String icone;

    @Column(columnDefinition = "boolean default true")
    private Boolean disponivel;
    
    @ManyToMany(mappedBy = "submenus", 
            targetEntity = Menu.class,
            fetch = FetchType.LAZY)
    private List<Menu> menus;

}
