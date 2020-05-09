package com.uisrael.NachoLee.Controller;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Matriculas;

public interface MatriculasControlador {
	public void insertarMatriculas(Matriculas nuevaMatricula);
	public List<Matriculas> listarMatriculas();
	public void eliminarMatriculas(Matriculas matricula);
	public void actualizarMatriculas(Matriculas matricula);
	public Matriculas buscarMatriculas(int idMatriculas);
}
