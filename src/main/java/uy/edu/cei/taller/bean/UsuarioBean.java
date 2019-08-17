package uy.edu.cei.taller.bean;

public class UsuarioBean {

	private long id;
	private String nombreUsuario;
	private String email;
	private String contraseña;
	private String ubicacion;
	private boolean activo;
	private int idRol;
	private int valoracion;
	private boolean verificado;
	private String connId;
	private boolean isEliminado;

	private RolBean Roles;
	
	private ClienteBean Clientes;

	public RolBean getRoles() {
		return Roles;
	}

	public void setRoles(RolBean roles) {
		this.Roles = roles;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Boolean getVerificado() {
		return verificado;
	}

	public void setVerificado(Boolean verificado) {
		this.verificado = verificado;
	}

	public String getConnId() {
		return connId;
	}

	public void setConnId(String connId) {
		this.connId = connId;
	}

	public Boolean getIsEliminado() {
		return isEliminado;
	}

	public void setIsEliminado(Boolean isEliminado) {
		this.isEliminado = isEliminado;
	}

	public ClienteBean getClientes() {
		return Clientes;
	}

	public void setClientes(ClienteBean clientes) {
		Clientes = clientes;
	}

}