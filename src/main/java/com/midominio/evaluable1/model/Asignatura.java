package com.midominio.evaluable1.model;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
	// propiedades 
	private int id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private int numeroCreditos;
	private int numeroAlumnosMatriculados;
	
	//constructor
	public Asignatura(int id, String nombre, String descripcion, String tipo, int numeroCreditos,
			int numeroAlumnosMatriculados) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.numeroCreditos = numeroCreditos;
		this.numeroAlumnosMatriculados = numeroAlumnosMatriculados;
	}
	
	//getters

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroCreditos() {
		return numeroCreditos;
	}

	public int getNumeroAlumnosMatriculados() {
		return numeroAlumnosMatriculados;
	}
	
	
	//Método para devolver lista de asignaturas
	public static List<Asignatura> dameListaAsignaturas() {
		List<Asignatura> listaAsignaturas = new ArrayList<>();
		
		listaAsignaturas.add(new Asignatura(1, "Matemáticas", "Curso introductorio a las matemáticas", "Ciencias", 6, 0));
		listaAsignaturas.add(new Asignatura(2, "Historia", "Introducción a la historia mundial", "Sociales", 4, 0));
		listaAsignaturas.add(new Asignatura(3, "Lengua Española", "Estudio de la gramática y literatura en español", "Letras", 5, 0));
		listaAsignaturas.add(new Asignatura(4, "Biología", "Explorando la vida y sus procesos", "Ciencias", 7, 0));
		listaAsignaturas.add(new Asignatura(5, "Física", "Conceptos básicos de la física", "Ciencias", 6, 0));
		listaAsignaturas.add(new Asignatura(6, "Química", "Introducción a la química y sus reacciones", "Ciencias", 7, 0));
		listaAsignaturas.add(new Asignatura(7, "Inglés", "Aprendizaje del idioma inglés", "Mixto", 4, 0));
		listaAsignaturas.add(new Asignatura(8, "Economía", "Principios básicos de economía", "Sociales", 5, 0));
		listaAsignaturas.add(new Asignatura(9, "Arte", "Exploración del arte y la creatividad", "Artístico", 3, 0));
		listaAsignaturas.add(new Asignatura(10, "Programación", "Introducción a la programación", "Ciencias", 6, 0));
		listaAsignaturas.add(new Asignatura(11, "Literatura Universal", "Estudio de la literatura mundial", "Letras", 4, 0));
		listaAsignaturas.add(new Asignatura(12, "Geografía", "Exploración de la geografía global", "Sociales", 5, 0));
		listaAsignaturas.add(new Asignatura(13, "Álgebra", "Conceptos básicos de álgebra", "Ciencias", 6, 0));
		listaAsignaturas.add(new Asignatura(14, "Música", "Introducción a la teoría musical", "Artístico", 3, 0));
		listaAsignaturas.add(new Asignatura(15, "Filosofía", "Exploración de ideas filosóficas", "Letras", 4, 0));
		listaAsignaturas.add(new Asignatura(16, "Psicología", "Introducción a la psicología", "Sociales", 5, 0));
		listaAsignaturas.add(new Asignatura(17, "Dibujo", "Fundamentos del dibujo artístico", "Artístico", 3, 0));
		listaAsignaturas.add(new Asignatura(18, "Cálculo", "Conceptos avanzados de cálculo", "Ciencias", 8, 0));
		listaAsignaturas.add(new Asignatura(19, "Sociología", "Introducción a la sociología", "Sociales", 5, 0));
		listaAsignaturas.add(new Asignatura(20, "Diseño Gráfico", "Principios del diseño gráfico", "Artístico", 4, 0));

		return listaAsignaturas;
	}
	
	public static List<Asignatura> asignaturasPorTipo(String tipo) {
		List<Asignatura> listaAsignaturas = new ArrayList<>();
		
		for (Asignatura a: Asignatura.dameListaAsignaturas()) {
			if (tipo.equalsIgnoreCase(a.getTipo())) {
				listaAsignaturas.add(a);
			}
		}
		return listaAsignaturas;
	}
	

}
