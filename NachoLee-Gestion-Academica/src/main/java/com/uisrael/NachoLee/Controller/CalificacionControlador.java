package com.uisrael.NachoLee.Controller;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Calificacion;

public interface CalificacionControlador {
	public void insertarCalificacion(Calificacion nuevaCalificacion);
	public List<Calificacion> listarCalificacion (Calificacion calificacion);
	public void eliminarCalificacion(Calificacion calificacion);
	public void actualizarCalificacion(Calificacion calificacion);
	public Calificacion buscarCalificacion(int idCalificacion);
}
