package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity

public class Rol implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9088762604649116240L;
	@Id
	/* @GeneratedValue(strategy = GenerationType.AUTO) */

	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private long id_rol;

	@Column
	private String nombre;

	@Column
	private String descripcion;

	public Rol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rol(long id_rol) {
		super();
		this.id_rol = id_rol;
	}

	public long getId_rol() {
		return id_rol;
	}

	public void setId_rol(long id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (int) (id_rol ^ (id_rol >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rol other = (Rol) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id_rol != other.id_rol)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Role [id=" + id_rol + ", name=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
