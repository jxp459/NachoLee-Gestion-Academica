package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.MateriaDAO;
import com.uisrael.NachoLee.modelo.entidades.Materia;

public class MateriaDAOimpl implements MateriaDAO {

	@Override
	public void insertarMateria(Materia nuevaMateria) {
		// Aquí programar el insert
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevaMateria);
		em.getTransaction().commit();

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
