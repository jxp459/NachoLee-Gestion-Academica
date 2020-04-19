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

	public Calificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calificacion(long id_calificacion) {
		super();
		this.id_calificacion = id_calificacion;
	}

	public long getId_calificacion() {
		return id_calificacion;
	}

	public void setId_calificacion(long id_calificacion) {
		this.id_calificacion = id_calificacion;
	}

	public String getNota_deberes() {
		return nota_deberes;
	}

	public void setNota_deberes(String nota_deberes) {
		this.nota_deberes = nota_deberes;
	}

	public String getNota_trabajos_clase() {
		return nota_trabajos_clase;
	}

	public void setNota_trabajos_clase(String nota_trabajos_clase) {
		this.nota_trabajos_clase = nota_trabajos_clase;
	}

	public String getNota_trabajos_grupales() {
		return nota_trabajos_grupales;
	}

	public void setNota_trabajos_grupales(String nota_trabajos_grupales) {
		this.nota_trabajos_grupales = nota_trabajos_grupales;
	}

	public String getNota_examen() {
		return nota_examen;
	}

	public void setNota_examen(String nota_examen) {
		this.nota_examen = nota_examen;
	}

	public String getCalificacion_final() {
		return calificacion_final;
	}

	public void setCalificacion_final(String calificacion_final) {
		this.calificacion_final = calificacion_final;
	}

	public Materia getMaterias() {
		return materias;
	}

	public void setMaterias(Materia materias) {
		this.materias = materias;
	}

	public Matriculas getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(Matriculas matriculas) {
		this.matriculas = matriculas;
	}

	@Override
	public String toString() {
		return "Calificacion [id_calificacion=" + id_calificacion + ", nota_deberes=" + nota_deberes
				+ ", nota_trabajos_clase=" + nota_trabajos_clase + ", nota_trabajos_grupales=" + nota_trabajos_grupales
				+ ", nota_examen=" + nota_examen + ", calificacion_final=" + calificacion_final + ", materias="
				+ materias + ", matriculas=" + matriculas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calificacion_final == null) ? 0 : calificacion_final.hashCode());
		result = prime * result + (int) (id_calificacion ^ (id_calificacion >>> 32));
		result = prime * result + ((materias == null) ? 0 : materias.hashCode());
		result = prime * result + ((matriculas == null) ? 0 : matriculas.hashCode());
		result = prime * result + ((nota_deberes == null) ? 0 : nota_deberes.hashCode());
		result = prime * result + ((nota_examen == null) ? 0 : nota_examen.hashCode());
		result = prime * result + ((nota_trabajos_clase == null) ? 0 : nota_trabajos_clase.hashCode());
		result = prime * result + ((nota_trabajos_grupales == null) ? 0 : nota_trabajos_grupales.hashCode());
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
		Calificacion other = (Calificacion) obj;
		if (calificacion_final == null) {
			if (other.calificacion_final != null)
				return false;
		} else if (!calificacion_final.equals(other.calificacion_final))
			return false;
		if (id_calificacion != other.id_calificacion)
			return false;
		if (materias == null) {
			if (other.materias != null)
				return false;
		} else if (!materias.equals(other.materias))
			return false;
		if (matriculas == null) {
			if (other.matriculas != null)
				return false;
		} else if (!matriculas.equals(other.matriculas))
			return false;
		if (nota_deberes == null) {
			if (other.nota_deberes != null)
				return false;
		} else if (!nota_deberes.equals(other.nota_deberes))
			return false;
		if (nota_examen == null) {
			if (other.nota_examen != null)
				return false;
		} else if (!nota_examen.equals(other.nota_examen))
			return false;
		if (nota_trabajos_clase == null) {
			if (other.nota_trabajos_clase != null)
				return false;
		} else if (!nota_trabajos_clase.equals(other.nota_trabajos_clase))
			return false;
		if (nota_trabajos_grupales == null) {
			if (other.nota_trabajos_grupales != null)
				return false;
		} else if (!nota_trabajos_grupales.equals(other.nota_trabajos_grupales))
			return false;
		return true;
	}

}
