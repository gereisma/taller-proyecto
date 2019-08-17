package uy.edu.cei.taller.bean;

import java.util.List;

public class ClienteBean {
	
	private int idUsuario;
	private String documento;
	private String nombre;
	private String apellido;
	private String telefono;
	private boolean isEliminado;
	private UsuarioBean Usuario;
	private List<ViajeBean> Viajes;
	private List<DireccionBean> Direcciones;
 	
	public UsuarioBean getUsuario() {
		return Usuario;
	}
	public void setUsuario(UsuarioBean usuario) {
		Usuario = usuario;
	}
	public List<ViajeBean> getViajes() {
		return Viajes;
	}
	public void setViajes(List<ViajeBean> viajes) {
		Viajes = viajes;
	}
	public List<DireccionBean> getDirecciones() {
		return Direcciones;
	}
	public void setDirecciones(List<DireccionBean> direcciones) {
		Direcciones = direcciones;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Boolean getIsEliminado() {
		return isEliminado;
	}
	public void setIsEliminado(Boolean isEliminado) {
		this.isEliminado = isEliminado;
	}
	
	
	

}
