package com.iamangelmp.mysql.main.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonaController {
	
	@GetMapping("/")
	public String getData(){
	
		return "test";
	}
	
	
}
