package com.midominio.evaluable1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
 // /home /
	@GetMapping({"/", "/home","/home"})
	public String homeHandler(Model model) {
		model.addAttribute("titulo", "Evaluación");
		model.addAttribute("H1", "Esta es la relacion de alumnos");
		model.addAttribute("parrafo1", "Esto es un parrafo de prueba para ver que funciona correctamente");
		model.addAttribute("parrafo2", "Segundo parrafo de prueba para ejercicio");
		model.addAttribute("parrafo3", "Tercer y último parrafo para la prueba del ejercicio");
	
		return "home";
	}
}
