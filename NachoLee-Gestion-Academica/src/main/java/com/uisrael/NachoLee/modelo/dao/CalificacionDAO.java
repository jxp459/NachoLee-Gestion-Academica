package com.uisrael.NachoLee.modelo.dao;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Calificacion;

public interface CalificacionDAO {

	public void insertarCalificacion(Calificacion nuevaCalificacion);
	public List<Calificacion> listarCalificacion ();
	public void eliminarCalificacion(Calificacion calificacion);
	public void actualizarCalificacion(Calificacion calificacion);
	public Calificacion buscarCalificacion(int idCalificacion);
}
