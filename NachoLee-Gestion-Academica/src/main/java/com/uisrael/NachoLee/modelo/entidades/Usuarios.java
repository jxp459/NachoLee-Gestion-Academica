package com.uisrael.NachoLee.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name = "Usuarios")
public class Usuarios implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)/*, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")*/
	@Column(name = "id_usuarios")
	private Long idUsuarios;

	@Column(name = "nombres", length = 25)
	private String nombres;

	@Column(name = "apellidos", length = 25)
	private String apellidos;

	@Column(name = "correo", length = 30/*, unique = true*/)
	private String correo;

	@Column(name = "usuario", length = 20/*, unique = true*/)
	private String usuario;

	@Column(name = "contraseña", length = 30)
	private String contraseña;

	@Column(name = "tipo_documento", length = 1)
	private String tipoDocumento;
	@Column()
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "numero_documento", length = 13/*, unique = true*/)
	private String numeroDocumento;

	@Column(name = "id_usuario_representante", length = 13)
	private String idUsuarioRepresentante;

	@Transient
	private String confirmPassword;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fkUsuario")
	private List<Matriculas> listaMatriculas=new ArrayList<Matriculas>();
	/*
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "rol_usuario", joinColumns = @JoinColumn(name = "id_usuarios"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private List<Rol> listaRol=new ArrayList<Rol>();
*/
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "fkUsuario")
	private List<RolUsuario> listaRolUsuario=new ArrayList<RolUsuario>();
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public List<Matriculas> getListaMatriculas() {
		return listaMatriculas;
	}

	public void setListaMatriculas(List<Matriculas> listaMatriculas) {
		this.listaMatriculas = listaMatriculas;
	}

	public List<RolUsuario> getListaRolUsuario() {
		return listaRolUsuario;
	}

	public void setListaRolUsuario(List<RolUsuario> listaRolUsuario) {
		this.listaRolUsuario = listaRolUsuario;
	}

	@Override
	public String toString() {
		return "Usuarios [idUsuarios=" + idUsuarios + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo="
				+ correo + ", usuario=" + usuario + ", contraseña=" + contraseña + ", tipoDocumento=" + tipoDocumento
				+ ", fechaNacimiento=" + fechaNacimiento + ", numeroDocumento=" + numeroDocumento
				+ ", idUsuarioRepresentante=" + idUsuarioRepresentante + ", confirmPassword=" + confirmPassword
				+ ", listaMatriculas=" + listaMatriculas + ", listaRol=" + listaRolUsuario + "]";
	}

	
}