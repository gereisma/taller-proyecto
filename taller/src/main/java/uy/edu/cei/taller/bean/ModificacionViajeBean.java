package uy.edu.cei.taller.bean;

import java.time.LocalDateTime;

public class ModificacionViajeBean {

	private int id;
	private LocalDateTime dtRealizado;
	private String descripcion;
	private int idUsuarioMod;
	private int idViaje;
	private boolean isEliminado;

	private UsuarioBean Usuarios;
	private ViajeBean Viajes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDtRealizado() {
		return dtRealizado;
	}

	public void setDtRealizado(LocalDateTime dtRealizado) {
		this.dtRealizado = dtRealizado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdUsuarioMod() {
		return idUsuarioMod;
	}

	public void setIdUsuarioMod(int idUsuarioMod) {
		this.idUsuarioMod = idUsuarioMod;
	}

	public int getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}

	public boolean isEliminado() {
		return isEliminado;
	}

	public void setEliminado(boolean isEliminado) {
		this.isEliminado = isEliminado;
	}

	public UsuarioBean getUsuarios() {
		return Usuarios;
	}

	public void setUsuarios(UsuarioBean usuarios) {
		Usuarios = usuarios;
	}

	public ViajeBean getViajes() {
		return Viajes;
	}

	public void setViajes(ViajeBean viajes) {
		Viajes = viajes;
	}

}