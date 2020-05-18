package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.RolUsuarioControlador;
import com.uisrael.NachoLee.modelo.dao.RolUsuarioDAO;
import com.uisrael.NachoLee.modelo.dao.impl.RolUsuarioDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.RolUsuario;

public class RolUsuarioControladorimpl implements RolUsuarioControlador{

private RolUsuarioDAO rolUsuarioDAO;
	@Override
	public void insertarRolUsuario(RolUsuario nuevoRolUsuario) {
		rolUsuarioDAO=new RolUsuarioDAOimpl();
		rolUsuarioDAO.insertarRolUsuario(nuevoRolUsuario);
		
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
