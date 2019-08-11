package uy.edu.cei.taller.bean;

import java.sql.Date;
import java.util.List;

public class ViajeBean {

	private Integer id;
	private Date dtEmision;
	private String estado;
	private Integer valoracionCliente;
	private Integer valoracionChofer;
	private double precioFinal;
	private String telefonoCliente;
	private String origen;
	private String destino;
	private Double cantKm;
	private Integer idChofer;
	private Integer idCliente;
	private Integer idUsuarioMod;
	private Date dtReserva;
	private Integer idViaje2;
	private boolean isEliminado;
	
	private ClienteBean Cliente;
	private List<ModificacionViajeBean> ModificacionesViajes;
	private UsuarioBean Usuario;
	private ViajeBean Viaje2;
	private RegistroViajeBean RegistroViaje;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDtEmision() {
		return dtEmision;
	}
	public void setDtEmision(Date dtEmision) {
		this.dtEmision = dtEmision;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getValoracionCliente() {
		return valoracionCliente;
	}
	public void setValoracionCliente(Integer valoracionCliente) {
		this.valoracionCliente = valoracionCliente;
	}
	public Integer getValoracionChofer() {
		return valoracionChofer;
	}
	public void setValoracionChofer(Integer valoracionChofer) {
		this.valoracionChofer = valoracionChofer;
	}
	public double getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Double getCantKm() {
		return cantKm;
	}
	public void setCantKm(Double cantKm) {
		this.cantKm = cantKm;
	}
	public Integer getIdChofer() {
		return idChofer;
	}
	public void setIdChofer(Integer idChofer) {
		this.idChofer = idChofer;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdUsuarioMod() {
		return idUsuarioMod;
	}
	public void setIdUsuarioMod(Integer idUsuarioMod) {
		this.idUsuarioMod = idUsuarioMod;
	}
	public Date getDtReserva() {
		return dtReserva;
	}
	public void setDtReserva(Date dtReserva) {
		this.dtReserva = dtReserva;
	}
	public Integer getIdViaje2() {
		return idViaje2;
	}
	public void setIdViaje2(Integer idViaje2) {
		this.idViaje2 = idViaje2;
	}
	public boolean isEliminado() {
		return isEliminado;
	}
	public void setEliminado(boolean isEliminado) {
		this.isEliminado = isEliminado;
	}
	public ClienteBean getCliente() {
		return Cliente;
	}
	public void setCliente(ClienteBean cliente) {
		Cliente = cliente;
	}
	public List<ModificacionViajeBean> getModificacionesViajes() {
		return ModificacionesViajes;
	}
	public void setModificacionesViajes(List<ModificacionViajeBean> modificacionesViajes) {
		ModificacionesViajes = modificacionesViajes;
	}
	public UsuarioBean getUsuarios() {
		return Usuario;
	}
	public void setUsuarios(UsuarioBean usuarios) {
		Usuario = usuarios;
	}
	public ViajeBean getViajes2() {
		return Viaje2;
	}
	public void setViajes2(ViajeBean viajes2) {
		Viaje2 = viajes2;
	}
	public RegistroViajeBean getRegistroViaje() {
		return RegistroViaje;
	}
	public void setRegistroViaje(RegistroViajeBean registroViaje) {
		RegistroViaje = registroViaje;
	}

}