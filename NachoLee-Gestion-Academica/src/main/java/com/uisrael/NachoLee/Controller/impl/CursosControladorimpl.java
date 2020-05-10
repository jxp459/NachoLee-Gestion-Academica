package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.CursosControlador;
import com.uisrael.NachoLee.modelo.dao.CursosDAO;
import com.uisrael.NachoLee.modelo.dao.impl.CursosDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.Cursos;

public class CursosControladorimpl implements CursosControlador {
	private CursosDAO cursosDAO;

	@Override
	public void insertarCurso(Cursos nuevoCurso) {
		cursosDAO = new CursosDAOimpl();
		cursosDAO.insertarCurso(nuevoCurso);

	}

	@Override
	public List<Cursos> listarCursos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCursos(Cursos curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCursos(Cursos curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cursos buscarCursos(int idCursos) {
		// TODO Auto-generated method stub
		return null;
	}

}
