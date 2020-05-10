package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cursos")
public class Cursos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)/*, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")*/
	@Column(name="id_curso")
	private long idCurso;

	@Column(length = 25, unique = true)
	private String nombre;

	@Column(length = 50)
	private String descripcion;

	
	public Cursos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cursos(long idCurso) {
		super();
		this.idCurso = idCurso;
	}

	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
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
	public String toString() {
		return "Cursos [idCurso=" + idCurso + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}
