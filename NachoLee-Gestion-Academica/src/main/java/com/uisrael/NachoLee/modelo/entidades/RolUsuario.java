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
@Table(name="RolUsuario")
public class RolUsuario implements Serializable{
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_RolUsuario")
	private long id_RolUsuario;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "fkUsuario")
	private Usuarios fkUsuario;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "fkRol")
	private Rol fkRol;
	
	public RolUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RolUsuario(long id_RolUsuario) {
		super();
		this.id_RolUsuario = id_RolUsuario;
	}
	public long getId_RolUsuario() {
		return id_RolUsuario;
	}
	public void setId_RolUsuario(long id_RolUsuario) {
		this.id_RolUsuario = id_RolUsuario;
	}
	
	public Usuarios getFkUsuario() {
		return fkUsuario;
	}
	public void setFkUsuario(Usuarios fkUsuario) {
		this.fkUsuario = fkUsuario;
	}
	public Rol getFkRol() {
		return fkRol;
	}
	public void setFkRol(Rol fkRol) {
		this.fkRol = fkRol;
	}
	@Override
	public String toString() {
		return "RolUsuario [id_RolUsuario=" + id_RolUsuario + "]";
	}
	
	
}
