package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Matriculas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1743300871595752381L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@ManyToOne
	@JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
	private Cursos cursos;

	@ManyToOne
	@JoinColumn(name = "id_estudiante", referencedColumnName = "id_usuarios", insertable = false, updatable = false)
	private Usuarios usuarios;

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

	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public String toString() {
		return "Matriculas [id_matricula=" + idMatricula + ", ano_lectivo=" + anoLectivo + ", cursos=" + cursos
				+ ", usuarios=" + usuarios + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoLectivo == null) ? 0 : anoLectivo.hashCode());
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result + (int) (idMatricula ^ (idMatricula >>> 32));
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
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
		Matriculas other = (Matriculas) obj;
		if (anoLectivo == null) {
			if (other.anoLectivo != null)
				return false;
		} else if (!anoLectivo.equals(other.anoLectivo))
			return false;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (idMatricula != other.idMatricula)
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}

}
