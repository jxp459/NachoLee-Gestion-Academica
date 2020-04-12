package com.NachoLee.UnidadEdu.Entity;

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
	@Column
	private long id_Curso;
	@Column
	private long id_usuarios;*/
	@Column(name = "año_lectivo")
	private String ano_lectivo;

	@ManyToOne
	@JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false)
	private Cursos cursos;

	@ManyToOne
	@JoinColumn(name = "id_estudiante", referencedColumnName = "id_usuarios", insertable = false, updatable = false)
	private Usuarios usuarios;
}
