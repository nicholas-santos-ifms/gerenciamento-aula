/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_menu;

import br.edu.ifms.arch.v010.repository.IArchRepository;
import java.util.List;

/**
 *
 * @author santos
 */
public interface MenuRepository extends IArchRepository<Menu, Long> {

    List<Menu> findByDisponivel(Boolean value);

}
