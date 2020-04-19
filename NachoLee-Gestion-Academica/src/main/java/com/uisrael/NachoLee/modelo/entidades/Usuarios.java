package com.uisrael.NachoLee.modelo.entidades;

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

	@Column(name = "id_usuario_representante", length = 13, unique = true)
	private String id_usuario_representante;

	@Transient
	private String confirmPassword;

	@ManyToMany(fetch = FetchType.LAZY)
	// @ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "rol_usuario", joinColumns = @JoinColumn(name = "id_usuarios"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Rol> roles;

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

	public String getId_usuario_representante() {
		return id_usuario_representante;
	}

	public void setId_usuario_representante(String id_usuario_representante) {
		this.id_usuario_representante = id_usuario_representante;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Usuarios [id_usuarios=" + id_usuarios + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", correo=" + correo + ", usuario=" + usuario + ", contraseña=" + contraseña + ", tipo_documento="
				+ tipo_documento + ", numero_documento=" + numero_documento + ", id_usuario_representante="
				+ id_usuario_representante + ", confirmPassword=" + confirmPassword + ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
		result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((id_usuario_representante == null) ? 0 : id_usuario_representante.hashCode());
		result = prime * result + ((id_usuarios == null) ? 0 : id_usuarios.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((numero_documento == null) ? 0 : numero_documento.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((tipo_documento == null) ? 0 : tipo_documento.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Usuarios other = (Usuarios) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (confirmPassword == null) {
			if (other.confirmPassword != null)
				return false;
		} else if (!confirmPassword.equals(other.confirmPassword))
			return false;
		if (contraseña == null) {
			if (other.contraseña != null)
				return false;
		} else if (!contraseña.equals(other.contraseña))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (id_usuario_representante == null) {
			if (other.id_usuario_representante != null)
				return false;
		} else if (!id_usuario_representante.equals(other.id_usuario_representante))
			return false;
		if (id_usuarios == null) {
			if (other.id_usuarios != null)
				return false;
		} else if (!id_usuarios.equals(other.id_usuarios))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (numero_documento == null) {
			if (other.numero_documento != null)
				return false;
		} else if (!numero_documento.equals(other.numero_documento))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (tipo_documento == null) {
			if (other.tipo_documento != null)
				return false;
		} else if (!tipo_documento.equals(other.tipo_documento))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}