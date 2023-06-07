/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamangelmp.Main.controllers;

import com.iamangelmp.Main.models.Usuario;
import java.util.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Alexis
 */
@RestController
public class UsuarioController {

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUser(@PathVariable Long id) {
		var usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Angel");
		usuario.setApellido("Marquez");
		usuario.setEmail("correo@correo.com");
		usuario.setTelefono("5566778899");
		usuario.setPass("Temporal1.");
		return usuario;
	}

	@RequestMapping(value = "usuarios")
	public List<Usuario> getAllUsers() {

		//var usuarios = new ArrayList();
		//List<Usuario> usuarios = new ArrayList();

		Usuario persona1 = new Usuario();
		persona1.setNombre("Angel");
		persona1.setApellido("Marquez");
		persona1.setEmail("alexis.mplt@outlook.es");
		persona1.setTelefono("6677889900");
		persona1.setPass("ertyui");

		Usuario persona2 = new Usuario();
		persona2.setNombre("Rosario");
		persona2.setApellido("Galvan");
		persona2.setEmail("rogalvan@hotmail.com");
		persona2.setTelefono("3344556677");
		persona2.setPass("oiuytredsxcv");

		Usuario persona3 = new Usuario();
		persona3.setNombre("Montse");
		persona3.setApellido("Solano");
		persona3.setEmail("monsolano2000@gmail.com");
		persona3.setTelefono("9944558811");
		persona3.setPass("mnbvcssdfyu");

		var usuarios = Arrays.asList(persona1, persona2, persona3);
		

		return usuarios;
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
