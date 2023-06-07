/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.controllers;

import com.iamangelmp.Main.models.Usuario;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Alexis
 */
@RestController
public class UsuarioController {

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		var usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Angel");
		usuario.setApellido("Marquez");
		usuario.setEmail("correo@correo.com");
		usuario.setTelefono("5566778899");
		usuario.setPass("Temporal1.");
		return usuario;
	}

//	@RequestMapping(value = "usuario")
//	public String editUser() {
//
//		return "edit user";
//	}
//
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
