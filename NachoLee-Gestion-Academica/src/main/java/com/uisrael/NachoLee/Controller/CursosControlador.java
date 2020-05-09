package com.uisrael.NachoLee.Controller;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Cursos;

public interface CursosControlador {
	public void insertarCurso(Cursos nuevoCurso);
	public List<Cursos> listarCursos();
	public void eliminarCursos(Cursos curso);
	public void actualizarCursos(Cursos curso);
	public Cursos buscarCursos(int idCursos);
}
