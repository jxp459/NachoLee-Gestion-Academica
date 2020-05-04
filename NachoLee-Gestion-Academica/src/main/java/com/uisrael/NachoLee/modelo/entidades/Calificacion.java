package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Calificacion")
public class Calificacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_calificacion")
	private long idCalificacion;
	@Column(name = "nota_deberes")
	private String notaDeberes;
	@Column(name = "nota_trabajos_clase")
	private String notaTrabajos_clase;
	@Column(name = "nota_trabajos_grupales")
	private String notaTrabajosGrupales;
	@Column(name = "nota_examen")
	private String notaExamen;
	@Column(name = "calificacion_final")
	private String calificacionFinal;
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

	public String getNotaDeberes() {
		return notaDeberes;
	}

	public void setNotaDeberes(String notaDeberes) {
		this.notaDeberes = notaDeberes;
	}

	public String getNotaTrabajos_clase() {
		return notaTrabajos_clase;
	}

	public void setNotaTrabajos_clase(String notaTrabajos_clase) {
		this.notaTrabajos_clase = notaTrabajos_clase;
	}

	public String getNotaTrabajosGrupales() {
		return notaTrabajosGrupales;
	}

	public void setNotaTrabajosGrupales(String notaTrabajosGrupales) {
		this.notaTrabajosGrupales = notaTrabajosGrupales;
	}

	public String getNotaExamen() {
		return notaExamen;
	}

	public void setNotaExamen(String notaExamen) {
		this.notaExamen = notaExamen;
	}

	public String getCalificacionFinal() {
		return calificacionFinal;
	}

	public void setCalificacionFinal(String calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
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
		return "Calificacion [idCalificacion=" + idCalificacion + ", notaDeberes=" + notaDeberes
				+ ", notaTrabajos_clase=" + notaTrabajos_clase + ", notaTrabajosGrupales=" + notaTrabajosGrupales
				+ ", notaExamen=" + notaExamen + ", calificacionFinal=" + calificacionFinal + ", materias=" + materias
				+ ", matriculas=" + matriculas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calificacionFinal == null) ? 0 : calificacionFinal.hashCode());
		result = prime * result + (int) (idCalificacion ^ (idCalificacion >>> 32));
		result = prime * result + ((materias == null) ? 0 : materias.hashCode());
		result = prime * result + ((matriculas == null) ? 0 : matriculas.hashCode());
		result = prime * result + ((notaDeberes == null) ? 0 : notaDeberes.hashCode());
		result = prime * result + ((notaExamen == null) ? 0 : notaExamen.hashCode());
		result = prime * result + ((notaTrabajosGrupales == null) ? 0 : notaTrabajosGrupales.hashCode());
		result = prime * result + ((notaTrabajos_clase == null) ? 0 : notaTrabajos_clase.hashCode());
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
		if (calificacionFinal == null) {
			if (other.calificacionFinal != null)
				return false;
		} else if (!calificacionFinal.equals(other.calificacionFinal))
			return false;
		if (idCalificacion != other.idCalificacion)
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
		if (notaDeberes == null) {
			if (other.notaDeberes != null)
				return false;
		} else if (!notaDeberes.equals(other.notaDeberes))
			return false;
		if (notaExamen == null) {
			if (other.notaExamen != null)
				return false;
		} else if (!notaExamen.equals(other.notaExamen))
			return false;
		if (notaTrabajosGrupales == null) {
			if (other.notaTrabajosGrupales != null)
				return false;
		} else if (!notaTrabajosGrupales.equals(other.notaTrabajosGrupales))
			return false;
		if (notaTrabajos_clase == null) {
			if (other.notaTrabajos_clase != null)
				return false;
		} else if (!notaTrabajos_clase.equals(other.notaTrabajos_clase))
			return false;
		return true;
	}
}
