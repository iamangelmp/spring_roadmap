package com.imangel.CRUD.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author Alexis
 */
@Controller
public class ControllerApp {
	
	@GetMapping("/")
	public String getData(Model model){
		String saludo = "Hola desde el controlador :D";
		model.addAttribute("saludo",saludo);
		return "index";
	}
	
}
