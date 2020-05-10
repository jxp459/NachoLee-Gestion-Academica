package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.CalificacionDAO;
import com.uisrael.NachoLee.modelo.entidades.Calificacion;

public class CalificacionDAOimpl implements CalificacionDAO {

	@Override
	public void insertarCalificacion(Calificacion nuevaCalificacion) {
		// Aquí programar el insert
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevaCalificacion);
		em.getTransaction().commit();
	}

	@Override
	public List<Calificacion> listarCalificacion() {
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
