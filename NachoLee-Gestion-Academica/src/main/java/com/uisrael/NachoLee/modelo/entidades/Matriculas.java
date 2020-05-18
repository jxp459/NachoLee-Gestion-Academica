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
@Table(name="Matriculas")
public class Matriculas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_matricula")
	private long idMatricula;/*
								 * @Column private long id_Curso;
								 * 
								 * @Column private long id_usuarios;
								 */
	@Column(name = "año_lectivo")
	private String anoLectivo;

	public Matriculas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matriculas(long idMatricula) {
		super();
		this.idMatricula = idMatricula;
	}

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fkMatriculas")
	private List<Calificacion> listaCalificacion=new ArrayList<Calificacion>();
	/*
	@ManyToOne
	@JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
	private Cursos cursos;*/
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkCurso")
	private Cursos fkCurso;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkUsuario")
	private Usuarios fkUsuario;
	/*@ManyToOne
	@JoinColumn(name = "id_estudiante", referencedColumnName = "id_usuarios", insertable = false, updatable = false)
	private Usuarios usuarios;*/
	
	public long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getAnoLectivo() {
		return anoLectivo;
	}

	public void setAnoLectivo(String anoLectivo) {
		this.anoLectivo = anoLectivo;
	}

	public Cursos getFkCurso() {
		return fkCurso;
	}

	public void setFkCurso(Cursos fkCurso) {
		this.fkCurso = fkCurso;
	}

	public Usuarios getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(Usuarios fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	@Override
	public String toString() {
		return "Matriculas [id_matricula=" + idMatricula + ", ano_lectivo=" + anoLectivo + ", cursos=" + fkCurso
				+ ", usuarios=" + fkUsuario + "]";
	}

	public List<Calificacion> getListaCalificacion() {
		return listaCalificacion;
	}

	public void setListaCalificacion(List<Calificacion> listaCalificacion) {
		this.listaCalificacion = listaCalificacion;
	}


}
