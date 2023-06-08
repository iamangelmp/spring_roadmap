/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.controllers;

import com.iamangelmp.Main.dao.UsuarioDAO;
import com.iamangelmp.Main.models.Usuario;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Alexis
 */
@RestController
public class UsuarioController {
	
@Autowired
private UsuarioDAO usuarioDAO;

	@RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
	public Usuario getUser(@PathVariable Long id) {
		return usuarioDAO.getUserById(id);
	}

	@RequestMapping(value = "api/usuarios")
	public List<Usuario> getAllUsers() {

		return usuarioDAO.getAllUsers();
	}
	
	@RequestMapping(value = "api/usuario/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		usuarioDAO.deleteById(id);
	}

	@RequestMapping(value = "api/usuario", method = RequestMethod.POST)
	public Usuario createUser(@RequestBody Usuario usuario) {
		System.out.println("----------------------> usuario = " +  usuario);
		return usuarioDAO.createUser(usuario);
		//return usuario;
	}


}
