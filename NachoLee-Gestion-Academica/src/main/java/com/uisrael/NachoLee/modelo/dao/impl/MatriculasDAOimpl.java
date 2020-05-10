package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.MatriculasDAO;
import com.uisrael.NachoLee.modelo.entidades.Matriculas;

public class MatriculasDAOimpl implements MatriculasDAO {

	@Override
	public void insertarMatriculas(Matriculas nuevaMatricula) {
		// Aquí programar el insert
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevaMatricula);
		em.getTransaction().commit();

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
