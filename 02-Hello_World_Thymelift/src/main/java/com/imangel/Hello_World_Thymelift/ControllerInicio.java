package com.imangel.Hello_World_Thymelift;

import com.imangel.Hello_World_Thymelift.domain.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		
		var persona2 = new Person();
		persona2.setName("Alexis");
		persona2.setLast_name("Peralta");
		persona2.setEmail("alexis.mplt@gmail.com");
		persona2.setPhone("2233445566");
		
		
//		CLASSIC METHOD		
//		List<Person> array_person = new ArrayList() ;
//		array_person.add(persona);
//		array_person.add(persona2);

		List<Person> person_array = Arrays.asList(persona, persona2);
		
		
		model.addAttribute("persona", persona);
		model.addAttribute("msj", persona.toString());
		model.addAttribute("persons", person_array);
		return "index";
	}
}
