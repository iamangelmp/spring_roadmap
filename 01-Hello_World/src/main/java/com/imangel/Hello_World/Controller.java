package com.imangel.Hello_World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexis
 */

@RestController
public class Controller {
		
	@GetMapping("/")
	public String start(){
		
		return "Hello world 90";
	}
	
}
