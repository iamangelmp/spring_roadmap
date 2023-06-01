package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controllerInicio {

	@GetMapping("/")
	public String inicio() {
		log.info("ejecutando el controlador MVC");
		return "index";
	}

}
