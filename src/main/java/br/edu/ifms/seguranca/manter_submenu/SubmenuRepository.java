/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.seguranca.manter_submenu;

import br.edu.ifms.arch.v010.repository.IArchRepository;
import java.util.List;

/**
 *
 * @author santos
 */
public interface SubmenuRepository extends IArchRepository<Submenu, Long> {

    List<Submenu> findByDisponivel(Boolean value);

}
