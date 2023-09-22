package com.imangel.Spring_Data;

import com.imangel.Spring_Data.Domain.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexis
 */
@Controller
public class ControllerApp {

	@GetMapping("/")
	public String start(Model model) {
		String saludo = "hi from controller :D";
		
		Person persona = new Person();
		persona.setName("Angel");
		persona.setLast_name("Marquez");
		persona.setEmail("alexis.mplt@outlook.es");
		persona.setPhone("5544663377");
		
		
		Person persona2 = new Person();
		persona2.setName("Alexis");
		persona2.setLast_name("Peralta");
		persona2.setEmail("alexis.mplt@gmail.com");
		persona2.setPhone("9988776655");
		
		List<Person> array_person = Arrays.asList(persona, persona2);
		
		
		
		model.addAttribute("persons", array_person);
		model.addAttribute("saludo", saludo);
		return "index";
	}

}
