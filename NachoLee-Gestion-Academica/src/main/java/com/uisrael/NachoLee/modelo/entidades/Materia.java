package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Materia")
public class Materia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)/*, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")*/
	@Column(name="id_materia")
	private long idMateria;
	@Column(length = 30, unique = true)
	private String nombre;
	@Column(length = 50)
	private String Descripcion;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkCurso")
	private Cursos fkCurso;
	/*@ManyToOne
	@JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
	private Cursos curso;*/
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fkMateria")
	private List<Calificacion> listaCalificacion=new ArrayList<Calificacion>();
	
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materia(long idMateria) {
		super();
		this.idMateria = idMateria;
	}

	public long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(long idMateria) {
		this.idMateria = idMateria;
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



	public Cursos getFkCurso() {
		return fkCurso;
	}

	public void setFkCurso(Cursos fkCurso) {
		this.fkCurso = fkCurso;
	}

	public List<Calificacion> getListaCalificacion() {
		return listaCalificacion;
	}

	public void setListaCalificacion(List<Calificacion> listaCalificacion) {
		this.listaCalificacion = listaCalificacion;
	}

	@Override
	public String toString() {
		return "Materia [id_materia=" + idMateria + ", nombre=" + nombre + ", Descripcion=" + Descripcion + "]";
	}


}
