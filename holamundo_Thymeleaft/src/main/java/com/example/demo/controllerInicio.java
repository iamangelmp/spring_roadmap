package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controllerInicio {

	@Value("${index.saludo}")
	private String saludo;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var mensaje = "Hola mundo con Thymeleaf";
		log.info("ejecutando el controlador MVC");
		
		var persona = new Persona();
		persona.setNombre("Angel");
		persona.setApellido("Marquez");
		persona.setEmail("alexis.mplt@gmail.com");
		persona.setCell("5443332211");
		
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("saludando", saludo);
		model.addAttribute("persona", persona);
		return "index";
	}

}
