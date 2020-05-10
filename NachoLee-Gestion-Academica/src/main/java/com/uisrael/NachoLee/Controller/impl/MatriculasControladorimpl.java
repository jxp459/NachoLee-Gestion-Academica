package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.MatriculasControlador;
import com.uisrael.NachoLee.modelo.dao.MatriculasDAO;
import com.uisrael.NachoLee.modelo.dao.impl.MatriculasDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.Matriculas;

public class MatriculasControladorimpl implements MatriculasControlador {
	private MatriculasDAO matriculasDAO;

	@Override
	public void insertarMatriculas(Matriculas nuevaMatricula) {
		matriculasDAO = new MatriculasDAOimpl();
		matriculasDAO.insertarMatriculas(nuevaMatricula);

	}

	@Override
	public List<Matriculas> listarMatriculas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarMatriculas(Matriculas matricula) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarMatriculas(Matriculas matricula) {
		// TODO Auto-generated method stub

	}

	@Override
	public Matriculas buscarMatriculas(int idMatriculas) {
		// TODO Auto-generated method stub
		return null;
	}
}
