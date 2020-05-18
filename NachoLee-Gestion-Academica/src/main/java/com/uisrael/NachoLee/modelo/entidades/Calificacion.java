package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Calificacion")
public class Calificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_calificacion")
	private long idCalificacion;
	@Column(name = "nota_deberes")
	private double notaDeberes;
	@Column(name = "nota_trabajos_clase")
	private double notaTrabajos_clase;
	@Column(name = "nota_trabajos_grupales")
	private double notaTrabajosGrupales;
	@Column(name = "nota_examen")
	private double notaExamen;
	@Column(name = "calificacion_final")
	private double calificacionFinal;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkMateria")
	private Materia fkMateria;
	/*@ManyToOne
	@JoinColumn(name = "id_materia", referencedColumnName = "id_materia", insertable = false, updatable = false)
	private Materia materias;*/
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "fkMatriculas")
	private Matriculas fkMatriculas;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_matricula", referencedColumnName = "id_matricula",
	 * insertable = false, updatable = false) private Matriculas matriculas;
	 */

	public Calificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calificacion(long idCalificacion) {
		super();
		this.idCalificacion = idCalificacion;
	}

	public long getIdCalificacion() {
		return idCalificacion;
	}

	public void setIdCalificacion(long idCalificacion) {
		this.idCalificacion = idCalificacion;
	}

	public double getNotaDeberes() {
		return notaDeberes;
	}

	public void setNotaDeberes(double notaDeberes) {
		this.notaDeberes = notaDeberes;
	}

	public double getNotaTrabajos_clase() {
		return notaTrabajos_clase;
	}

	public void setNotaTrabajos_clase(double notaTrabajos_clase) {
		this.notaTrabajos_clase = notaTrabajos_clase;
	}

	public double getNotaTrabajosGrupales() {
		return notaTrabajosGrupales;
	}

	public void setNotaTrabajosGrupales(double notaTrabajosGrupales) {
		this.notaTrabajosGrupales = notaTrabajosGrupales;
	}

	public double getNotaExamen() {
		return notaExamen;
	}

	public void setNotaExamen(double notaExamen) {
		this.notaExamen = notaExamen;
	}

	public double getCalificacionFinal() {
		return calificacionFinal;
	}

	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}

	public Materia getFkMateria() {
		return fkMateria;
	}

	public void setFkMateria(Materia fkMateria) {
		this.fkMateria = fkMateria;
	}

	public Matriculas getFkMatriculas() {
		return fkMatriculas;
	}

	public void setFkMatriculas(Matriculas fkMatriculas) {
		this.fkMatriculas = fkMatriculas;
	}

	
}
