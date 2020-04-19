package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Materia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5628399393957603685L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private long id_materia;
	@Column(length = 30, unique = true)
	private String nombre;
	@Column(length = 50)
	private String Descripcion;

	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materia(long id_materia) {
		super();
		this.id_materia = id_materia;
	}

	public long getId_materia() {
		return id_materia;
	}

	public void setId_materia(long id_materia) {
		this.id_materia = id_materia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Materia [id_materia=" + id_materia + ", nombre=" + nombre + ", Descripcion=" + Descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Descripcion == null) ? 0 : Descripcion.hashCode());
		result = prime * result + (int) (id_materia ^ (id_materia >>> 32));
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
		Materia other = (Materia) obj;
		if (Descripcion == null) {
			if (other.Descripcion != null)
				return false;
		} else if (!Descripcion.equals(other.Descripcion))
			return false;
		if (id_materia != other.id_materia)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
