package com.uisrael.NachoLee.Controller;

import java.util.List;

import com.uisrael.NachoLee.modelo.entidades.Materia;

public interface MateriaControlador {
	public void insertarMateria(Materia nuevaMateria);
	public List<Materia> listarMateria();
	public void eliminarMateria(Materia materia);
	public void actualizarMateria(Materia materia);
	public Materia buscarMateria(int idMateria);
}
