/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.controllers;

import com.iamangelmp.Main.dao.UsuarioDAO;
import com.iamangelmp.Main.dao.UsuarioDAOImp;
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

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUser(@PathVariable Long id) {
		var usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Angel");
		usuario.setApellido("Marquez");
		usuario.setEmail("correo@correo.com");
		usuario.setTelefono("5566778899");
		usuario.setPassword("Temporal1.");
		return usuario;
	}

	@RequestMapping(value = "usuarios")
	public List<Usuario> getAllUsers() {

		return usuarioDAO.getAllUsers();
	}

//	@RequestMapping(value = "usuario")
//	public String createUser() {
//		return "create user";
//	}
//
//	@RequestMapping(value = "usuario")
//	public String deleteUser() {
//		return "delete user";
//	}
}
