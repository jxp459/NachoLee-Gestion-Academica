package com.NachoLee.UnidadEdu.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.JoinColumn;

@Entity
public class Usuarios implements Serializable {

	private static final long serialVersionUID = -6833167247955613395L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id_usuarios;

	@Column(name = "nombres", length = 25)
	private String nombres;

	@Column(name = "apellidos", length = 25)
	private String apellidos;

	@Column(name = "correo", length = 30, unique = true)
	private String correo;

	@Column(name = "usuario", length = 20, unique = true)
	private String usuario;

	@Column(name = "contraseña", length = 30)
	private String contraseña;

	@Column(name = "tipo_documento", length = 1)
	private String tipo_documento;

	@Column(name = "numero_documento", length = 13, unique = true)
	private String numero_documento;
	
	@Column(name = "id_usuario_padre", length = 13, unique = true)
	private String id_usuario_padre;
	
	@Transient
	private String confirmPassword;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "rol_usuario", joinColumns = @JoinColumn(name = "id_usuarios"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Rol> roles;
	/*
	@ManyToOne(targetEntity = Cursos.class,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	
	private Set<Cursos> cursos;
	

	public Set<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Cursos> curso) {
		this.cursos = curso;
	}*/

	public Usuarios() {
		super();
	}

	public Usuarios(Long id_usuarios) {
		super();
		this.id_usuarios = id_usuarios;
	}

	public Long getId_usuarios() {
		return id_usuarios;
	}

	public void setId_usuarios(Long id_usuarios) {
		this.id_usuarios = id_usuarios;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getId_usuario_padre() {
		return id_usuario_padre;
	}

	public void setId_usuario_padre(String id_usuario_padre) {
		this.id_usuario_padre = id_usuario_padre;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

}