package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.MateriaControlador;
import com.uisrael.NachoLee.modelo.dao.MateriaDAO;
import com.uisrael.NachoLee.modelo.dao.impl.MateriaDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.Materia;

public class MateriaControladorimpl implements MateriaControlador {
	private MateriaDAO materiaDAO;

	@Override
	public void insertarMateria(Materia nuevaMateria) {
		materiaDAO = new MateriaDAOimpl();
		materiaDAO.insertarMateria(nuevaMateria);

	}

	@Override
	public List<Materia> listarMateria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarMateria(Materia materia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub

	}

	@Override
	public Materia buscarMateria(int idMateria) {
		// TODO Auto-generated method stub
		return null;
	}

}
