package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import java.util.Date;
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
	@Column(name="id_usuarios")
	private Long idUsuarios;

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
	private String tipoDocumento;

	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name = "numero_documento", length = 13, unique = true)
	private String numeroDocumento;

	@Column(name = "id_usuario_representante", length = 13, unique = true)
	private String idUsuarioRepresentante;

	@Transient
	private String confirmPassword;

	@ManyToMany(fetch = FetchType.LAZY)
	// @ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "rol_usuario", joinColumns = @JoinColumn(name = "id_usuarios"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Rol> roles;

	public Usuarios() {
		super();
	}

	public Usuarios(Long idUsuarios) {
		super();
		this.idUsuarios = idUsuarios;
	}

	public Long getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(Long idUsuarios) {
		this.idUsuarios = idUsuarios;
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getIdUsuarioRepresentante() {
		return idUsuarioRepresentante;
	}

	public void setIdUsuarioRepresentante(String idUsuarioRepresentante) {
		this.idUsuarioRepresentante = idUsuarioRepresentante;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuarios=" + idUsuarios + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo="
				+ correo + ", usuario=" + usuario + ", contraseña=" + contraseña + ", tipoDocumento=" + tipoDocumento
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroDocumento=" + numeroDocumento
				+ ", idUsuarioRepresentante=" + idUsuarioRepresentante + ", confirmPassword=" + confirmPassword
				+ ", roles=" + roles + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((confirmPassword == null) ? 0 : confirmPassword.hashCode());
		result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((idUsuarioRepresentante == null) ? 0 : idUsuarioRepresentante.hashCode());
		result = prime * result + ((idUsuarios == null) ? 0 : idUsuarios.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
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
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (idUsuarioRepresentante == null) {
			if (other.idUsuarioRepresentante != null)
				return false;
		} else if (!idUsuarioRepresentante.equals(other.idUsuarioRepresentante))
			return false;
		if (idUsuarios == null) {
			if (other.idUsuarios != null)
				return false;
		} else if (!idUsuarios.equals(other.idUsuarios))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}