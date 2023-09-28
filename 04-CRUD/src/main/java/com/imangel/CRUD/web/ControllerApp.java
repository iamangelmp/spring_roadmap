package com.imangel.CRUD.web;

import com.imangel.CRUD.DAO.PersonDAO;
import com.imangel.CRUD.domain.Person;
import com.imangel.CRUD.service.ServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Alexis
 */
@Controller
public class ControllerApp {

	@Autowired
	private ServicePerson service;

	@GetMapping("/")
	public String getData(Model model) {

		var persons = service.getAllPesons();

		String saludo = "Hi from controller :D";
		model.addAttribute("persons", persons);
		model.addAttribute("saludo", saludo);
		return "index";
	}

	@GetMapping("/add")
	public String create(Person person) {
		return "add";
	}

	@GetMapping("/edit/{user_id}")
	public String edit(Person person, Model model) {
		person = service.getPerson(person);
		model.addAttribute("person", person);
		return "add";
	}

	@GetMapping("/delete/{user_id}")
	public String delete(Person person, Model model) {
		service.detelePerson(person);
		return "redirect:/";
	}

	@PostMapping("/save")
	public String save(Person person) {
		service.createPerson(person);
		return "redirect:/";
	}

}
