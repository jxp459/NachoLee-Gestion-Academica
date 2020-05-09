package com.uisrael.NachoLee.Controller;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Usuarios;

public interface UsuariosControlador {
	public void insertarUsuarios(Usuarios nuevoUsuario);
	public List<Usuarios> listarUsuarios();
	public void eliminarUsuarios(Usuarios nuevo);
	public void actualizarUsuarios(Usuarios nuevo);
	public Usuarios buscarUsuarios(int idUsuario);
}
