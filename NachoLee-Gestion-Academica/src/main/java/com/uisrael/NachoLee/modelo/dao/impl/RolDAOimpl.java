package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.RolDAO;
import com.uisrael.NachoLee.modelo.entidades.Rol;

public class RolDAOimpl implements RolDAO {

	@Override
	public void insertarRol(Rol nuevoRol) {
		// Aqu� programar el insert
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevoRol);
		em.getTransaction().commit();
	}

	@Override
	public List<Rol> listarRol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarRol(Rol rol) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarRol(Rol rol) {
		// TODO Auto-generated method stub

	}

	@Override
	public Rol buscarRol(int idRol) {
		// TODO Auto-generated method stub
		return null;
	}

}
