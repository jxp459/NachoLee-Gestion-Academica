package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.CursosDAO;
import com.uisrael.NachoLee.modelo.entidades.Cursos;

public class CursosDAOimpl implements CursosDAO {

	@Override
	public void insertarCurso(Cursos nuevoCurso) {
		// Aquí programar el insert
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevoCurso);
		em.getTransaction().commit();

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
