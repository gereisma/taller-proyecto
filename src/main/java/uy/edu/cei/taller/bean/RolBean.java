package uy.edu.cei.taller.bean;

import java.util.List;

public class RolBean {

	private int id;
	private String rol;	
	private List<PermisoBean> Permisos;
	private List<UsuarioBean> Usuarios;
	
	public List<UsuarioBean> getUsuario() {
		return Usuarios;
	}

	public void setUsuario(List<UsuarioBean> Usuarios) {
		this.Usuarios = Usuarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<PermisoBean> getPermisos() {
		return Permisos;
	}

	public void setPermisos(List<PermisoBean> permisos) {
		this.Permisos = permisos;
	}

}