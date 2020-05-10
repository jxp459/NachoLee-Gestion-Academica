package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.UsuariosDAO;
import com.uisrael.NachoLee.modelo.entidades.Usuarios;

public class UsuariosDAOimpl implements UsuariosDAO{

	@Override
	public void insertarUsuarios(Usuarios nuevoUsuario) {
		// Aquí programar el insert
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevoUsuario);
		em.getTransaction().commit();
	}

	@Override
	public List<Usuarios> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuarios(Usuarios usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuarios(Usuarios usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuarios buscarUsuarios(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
