package com.NachoLee.UnidadEdu.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;
@Entity
public class Cursos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5160822006386390735L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private long id_Curso;
	
	@Column(length = 25, unique = true)
	private String nombre;
	
	@Column(length = 50)
	private String descripcion;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "curso_materia", joinColumns = @JoinColumn(name="id_curso"), inverseJoinColumns =@JoinColumn(name="id_materia"))
	private Set<Materia> materia;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "curso_usuario", joinColumns = @JoinColumn(name="id_curso"), inverseJoinColumns =@JoinColumn(name="id_usuario"))
	private Set<Usuarios> usuarios;
	
	public Set<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}

	public long getId_Curso() {
		return id_Curso;
	}

	public void setId_Curso(long id_Curso) {
		this.id_Curso = id_Curso;
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

	public Set<Materia> getMateria() {
		return materia;
	}

	public void setMateria(Set<Materia> materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Curso [id_Curso=" + id_Curso + ", nombre=" + nombre + ", descripcion=" + descripcion + ", materia="
				+ materia + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (int) (id_Curso ^ (id_Curso >>> 32));
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
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
		Cursos other = (Cursos) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (id_Curso != other.id_Curso)
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
