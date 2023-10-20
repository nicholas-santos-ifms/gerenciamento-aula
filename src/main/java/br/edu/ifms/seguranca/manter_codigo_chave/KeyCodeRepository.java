/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.seguranca.manter_codigo_chave;

import br.edu.ifms.arch.v010.repository.IArchRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nicholas.santos
 */
@Repository
public interface KeyCodeRepository extends IArchRepository<KeyCode, String> {
    
    public List<KeyCode> findByMail(String mail);
    public void deleteByMail(String mail);
}
