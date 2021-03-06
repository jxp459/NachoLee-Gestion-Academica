package com.uisrael.NachoLee.modelo.dao;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Usuarios;

public interface UsuariosDAO {

	public void insertarUsuarios(Usuarios nuevoUsuario);
	public List<Usuarios> listarUsuarios();
	public void eliminarUsuarios(Usuarios usuario);
	public void actualizarUsuarios(Usuarios usuario);
	public Usuarios buscarUsuarios(int idUsuario);
}
