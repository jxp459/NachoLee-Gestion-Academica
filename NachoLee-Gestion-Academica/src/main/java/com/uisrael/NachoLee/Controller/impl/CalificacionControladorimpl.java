package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.CalificacionControlador;
import com.uisrael.NachoLee.modelo.dao.CalificacionDAO;
import com.uisrael.NachoLee.modelo.dao.impl.CalificacionDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.Calificacion;

public class CalificacionControladorimpl implements CalificacionControlador {
	private CalificacionDAO calificacionDAO;

	@Override
	public void insertarCalificacion(Calificacion nuevaCalificacion) {
		calificacionDAO = new CalificacionDAOimpl();
		calificacionDAO.insertarCalificacion(nuevaCalificacion);

	}

	@Override
	public List<Calificacion> listarCalificacion(Calificacion calificacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCalificacion(Calificacion calificacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCalificacion(Calificacion calificacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public Calificacion buscarCalificacion(int idCalificacion) {
		// TODO Auto-generated method stub
		return null;
	}
}
