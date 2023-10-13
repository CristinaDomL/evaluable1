package com.midominio.evaluable1.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.evaluable1.model.Asignatura;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/asignatura/")
public class AsignaturaController {
	
	@ModelAttribute ("titulo")
	public String tituloGeneral() {
		return "Evaluación";
	}
	// /asignatura/listado/con: listado de asignaturas con alumnos
	
	@GetMapping("/listado/con")
		public String conAlumnos(Model model) {
		model.addAttribute("H1", "Lista de asignatura con alumnos");
		model.addAttribute("listaAsignaturas", Asignatura.dameListaAsignaturas());
		return "asignatura/listado-con";
	}
	
	@GetMapping("/listado/sin")
		public String sinAlumnos(Model model) {
		model.addAttribute("H1", "Lista de asignatura sin alumnos");
		model.addAttribute("listaAsignaturas", Asignatura.dameListaAsignaturas());
		return "asignatura/listado-sin";
	}
	
	@GetMapping("/listado")
		public String listaAlumnos(@RequestParam String tipo, @RequestParam(value = "tipo", defaultValue= "todos") Model model) {
		List<Asignatura> listaRecortada = new ArrayList<>();
		if ("todos".equals(tipo)) {
			listaRecortada = Asignatura.dameListaAsignaturas();
		}else {
			listaRecortada = Asignatura.asignaturasPorTipo(tipo);
			}
		
		
		model.addAttribute("H1", "Lista de asignaturas");
		model.addAttribute("listadoAsignaturas", listaRecortada);
		
		return "asignatura/listado";
	
	}
	}
	
