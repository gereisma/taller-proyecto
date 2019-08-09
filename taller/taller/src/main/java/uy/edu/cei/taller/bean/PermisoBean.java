package uy.edu.cei.taller.bean;

import java.util.List;

public class PermisoBean {

	private int id;
	private String nombre;
	
	private List<RolBean> roles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<RolBean> getRoles() {
		return roles;
	}

	public void setRoles(List<RolBean> roles) {
		this.roles = roles;
	}
}