package com.imangel.Hello_World_Thymelift;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexis
 */
@Controller
public class ControllerInicio {
	
	@Value("${index.saludo}")
	private String saludo;
	
	@GetMapping("/")
	public String start(Model model){
		String msj = this.saludo;
		model.addAttribute("msj", msj);
		return "index";
	}
}
