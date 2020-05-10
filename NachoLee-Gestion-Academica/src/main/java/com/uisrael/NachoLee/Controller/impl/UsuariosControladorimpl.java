package com.uisrael.NachoLee.Controller.impl;

import java.util.List;

import com.uisrael.NachoLee.Controller.UsuariosControlador;
import com.uisrael.NachoLee.modelo.dao.UsuariosDAO;
import com.uisrael.NachoLee.modelo.dao.impl.UsuariosDAOimpl;
import com.uisrael.NachoLee.modelo.entidades.Usuarios;

public class UsuariosControladorimpl implements UsuariosControlador {

	private UsuariosDAO usuarioDao;//interface
	@Override
	public void insertarUsuarios(Usuarios nuevoUsuario) {
		// Aquí llamamos el metodo insert
		usuarioDao=new UsuariosDAOimpl();//implementacion
		usuarioDao.insertarUsuarios(nuevoUsuario);
	}

	@Override
	public List<Usuarios> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuarios(Usuarios nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuarios(Usuarios nuevo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuarios buscarUsuarios(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
