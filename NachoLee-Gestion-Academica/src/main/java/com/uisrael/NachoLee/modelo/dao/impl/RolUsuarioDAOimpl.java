package com.uisrael.NachoLee.modelo.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.NachoLee.modelo.dao.RolUsuarioDAO;
import com.uisrael.NachoLee.modelo.entidades.RolUsuario;

public class RolUsuarioDAOimpl implements RolUsuarioDAO{

	@Override
	public void insertarRolUsuario(RolUsuario nuevoRolUsuario) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("NachoLeePU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(nuevoRolUsuario);
		em.getTransaction().commit();
	}

	@Override
	public List<RolUsuario> listarRolUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarRolUsuario(RolUsuario rolUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarRolUsuario(RolUsuario rolUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RolUsuario buscarRolUsuario(int idRolUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
