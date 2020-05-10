package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.RolControlador;
import com.uisrael.NachoLee.modelo.dao.RolDAO;
import com.uisrael.NachoLee.modelo.dao.impl.RolDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.Rol;

public class RolControladorimpl implements RolControlador{
private RolDAO rolDao;
	@Override
	public void insertarRol(Rol nuevoRol) {
		rolDao=new RolDAOimpl();//implementacion
		rolDao.insertarRol(nuevoRol);
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
