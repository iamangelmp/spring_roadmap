package com.imangel.Hello_World;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexis
 */

@RestController
@Slf4j
public class Controller {
	
	@GetMapping("/")
	public String start(){
		log.info("--> exucute Rest Controller");
		log.debug("--> more info about controller");
		return "Hello world";
	}
	
}
