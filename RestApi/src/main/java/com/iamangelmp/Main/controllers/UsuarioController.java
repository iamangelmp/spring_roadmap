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

	@GetMapping("/")
	public String prueba(){
		return "test";
	}
	
	@PostMapping

	@RequestMapping(value = "usuario")
	public Usuario test() {
		var usuario = new Usuario();
		usuario.setNombre("Angel");
		usuario.setApellido("Marquez");
		usuario.setEmail("correo@correo.com");
		usuario.setTelefono("5566778899");
		usuario.setPass("Temporal1.");
		return usuario;
	}
}
