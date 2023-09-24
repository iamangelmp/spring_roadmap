package com.imangel.Spring_Data.web;

import com.imangel.Spring_Data.DAO.PersonDAO;
import com.imangel.Spring_Data.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Alexis
 */
@Controller
public class ControllerApp {
	
	@Autowired
	private PersonService personDAO;

	@GetMapping("/")
	public String start(Model model) {
		String saludo = "hi from controller :D";
		
		var personas = personDAO.ListPersons();
		
		model.addAttribute("persons", personas);
		model.addAttribute("saludo", saludo);
		return "index";
	}

}
