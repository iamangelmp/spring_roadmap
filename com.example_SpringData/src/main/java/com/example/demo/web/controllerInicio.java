package com.example.demo.web;

import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controllerInicio {

	
	@GetMapping("/")
	public String inicio(Model model) {
		log.info("ejecutando el controlador MVC");
		

//		model.addAttribute("personas", personas);
		return "index";
	}

}
