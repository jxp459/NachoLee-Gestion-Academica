package com.uisrael.NachoLee.Controller;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.RolUsuario;

public interface RolUsuarioControlador {
	public void insertarRolUsuario(RolUsuario nuevoRolUsuario);
	public List<RolUsuario> listarRolUsuario();
	public void eliminarRolUsuario(RolUsuario rolUsuario);
	public void actualizarRolUsuario(RolUsuario rolUsuario);
	public RolUsuario buscarRolUsuario(int idRolUsuario);
}
