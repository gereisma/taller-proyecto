package uy.edu.cei.taller.bean;

import java.util.List;

public class RolBean {

	private int id;
	private String rol;	
	private List<PermisoBean> permisos;
	private UsuarioBean usuario;
	
	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
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
		return permisos;
	}

	public void setPermisos(List<PermisoBean> permisos) {
		this.permisos = permisos;
	}

}