package com.imangel.Spring_Data.web;

import com.imangel.Spring_Data.DAO.PersonDAO;
import com.imangel.Spring_Data.Domain.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private PersonDAO personDAO;

	@GetMapping("/")
	public String start(Model model) {
		String saludo = "hi from controller :D";
		
		var personas = personDAO.findAll();
		
		model.addAttribute("persons", personas);
		model.addAttribute("saludo", saludo);
		return "index";
	}

}
