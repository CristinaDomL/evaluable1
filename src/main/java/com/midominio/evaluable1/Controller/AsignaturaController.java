package com.midominio.evaluable1.Controller;





import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable1.model.Asignatura;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/asignatura/lista")
public class AsignaturaController {
	// /asignatura/listado/con: listado de asignaturas con alumnos
	
	@GetMapping({"/asignatura/lista/con"})
		public String conAlumnos(Model model) {
		model.addAttribute("tituloH1", "Lista de asignatura con alumnos");
		model.addAttribute("listaAsignaturas", Asignatura.dameListaAsignaturas());
		return "listacon";
	}
	
}