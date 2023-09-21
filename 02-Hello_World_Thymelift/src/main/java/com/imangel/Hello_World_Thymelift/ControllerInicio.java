package com.imangel.Hello_World_Thymelift;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexis
 */
@Controller
public class ControllerInicio {
	
	@GetMapping("/")
	public String start(){
		return "index";
	}
}
