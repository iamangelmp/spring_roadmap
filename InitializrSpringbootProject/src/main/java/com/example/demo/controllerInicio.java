package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class controllerInicio {

	@GetMapping("/")
	public String inicio() {
		log.info("ejecutando el controlador");
		return "Hola mundo desde controllador 2";
	}

}
