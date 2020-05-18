package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fkCurso")
	private List<Materia> listaMateria=new ArrayList<Materia>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fkCurso")
	private List<Matriculas> listaMatriculas=new ArrayList<Matriculas>();
	
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

	public List<Materia> getListaMateria() {
		return listaMateria;
	}

	public void setListaMateria(List<Materia> listaMateria) {
		this.listaMateria = listaMateria;
	}

	@Override
	public String toString() {
		return "Cursos [idCurso=" + idCurso + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}
