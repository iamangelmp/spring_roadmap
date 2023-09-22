package com.imangel.Hello_World_Thymelift;

import com.imangel.Hello_World_Thymelift.domain.Person;
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
		
		Person persona = new Person();
		persona.setName("Angel");
		persona.setLast_name("Marquez");
		persona.setEmail("alexis.mplt@outlook.es");
		persona.setPhone("2233445566");
		
		model.addAttribute("persona", persona);
		model.addAttribute("msj", persona.toString());
		return "index";
	}
}
