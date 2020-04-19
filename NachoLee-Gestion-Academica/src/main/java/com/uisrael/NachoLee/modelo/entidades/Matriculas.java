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

	private long id_matricula;/*
								 * @Column private long id_Curso;
								 * 
								 * @Column private long id_usuarios;
								 */
	@Column(name = "año_lectivo")
	private String ano_lectivo;

	public Matriculas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matriculas(long id_matricula) {
		super();
		this.id_matricula = id_matricula;
	}

	@ManyToOne
	@JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
	private Cursos cursos;

	@ManyToOne
	@JoinColumn(name = "id_estudiante", referencedColumnName = "id_usuarios", insertable = false, updatable = false)
	private Usuarios usuarios;

	public long getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(long id_matricula) {
		this.id_matricula = id_matricula;
	}

	public String getAno_lectivo() {
		return ano_lectivo;
	}

	public void setAno_lectivo(String ano_lectivo) {
		this.ano_lectivo = ano_lectivo;
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
		return "Matriculas [id_matricula=" + id_matricula + ", ano_lectivo=" + ano_lectivo + ", cursos=" + cursos
				+ ", usuarios=" + usuarios + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano_lectivo == null) ? 0 : ano_lectivo.hashCode());
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result + (int) (id_matricula ^ (id_matricula >>> 32));
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
		if (ano_lectivo == null) {
			if (other.ano_lectivo != null)
				return false;
		} else if (!ano_lectivo.equals(other.ano_lectivo))
			return false;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (id_matricula != other.id_matricula)
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}

}
