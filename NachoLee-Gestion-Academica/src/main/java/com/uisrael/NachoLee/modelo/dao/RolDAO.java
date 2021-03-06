package com.uisrael.NachoLee.modelo.dao;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Rol;

public interface RolDAO {
	public void insertarRol(Rol nuevoRol);
	public List<Rol> listarRol();
	public void eliminarRol(Rol rol);
	public void actualizarRol(Rol rol);
	public Rol buscarRol(int idRol);
}
