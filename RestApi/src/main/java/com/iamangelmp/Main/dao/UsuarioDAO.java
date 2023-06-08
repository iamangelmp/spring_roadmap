/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.iamangelmp.Main.dao;

import com.iamangelmp.Main.models.Usuario;
import java.util.List;

/**
 *
 * @author Alexis
 */
public interface UsuarioDAO {
	
	List<Usuario> getAllUsers();

	public void deleteById(Long id);

	Usuario getUserById(Long id);

	
}
