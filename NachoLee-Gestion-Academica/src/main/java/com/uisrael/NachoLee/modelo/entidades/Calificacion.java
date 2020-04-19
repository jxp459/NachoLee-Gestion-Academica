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
public class Calificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1743300871595752381L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id_calificacion;
	@Column(name = "nota_deberes")
	private String nota_deberes;
	@Column(name = "nota_trabajos_clase")
	private String nota_trabajos_clase;
	@Column(name = "nota_trabajos_grupales")
	private String nota_trabajos_grupales;
	@Column(name = "nota_examen")
	private String nota_examen;
	@Column(name = "calificacion_final")
	private String calificacion_final;
	@ManyToOne
	@JoinColumn(name = "id_materia", referencedColumnName = "id_materia", insertable = false, updatable = false)
	private Materia materias;

	@ManyToOne
	@JoinColumn(name = "id_matricula", referencedColumnName = "id_matricula", insertable = false, updatable = false)
	private Matriculas matriculas;
}
