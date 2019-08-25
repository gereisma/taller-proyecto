package uy.edu.cei.taller.bean;

import java.sql.Date;
import java.util.List;

public class ViajeBean {

	private int id;
	private Date dtEmision;
	private String estado;
	private Long valoracionCliente;
	private Long valoracionChofer;
	private double precioFinal;
	private String telefonoCliente;
	private String origen;
	private String destino;
	private double cantKm;
	private Long idChofer;
	private Long idCliente;
	private Long idUsuarioMod;
	private Date dtReserva;
	private Long idViaje2;
	private Boolean isEliminado;
	
	private ClienteBean Cliente;
	private List<ModificacionViajeBean> ModificacionesViajes;
	private UsuarioBean Usuario;
	private ViajeBean Viaje2;
	private RegistroViajeBean RegistroViaje;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Long getValoracionCliente() {
		return valoracionCliente;
	}
	public void setValoracionCliente(Long valoracionCliente) {
		this.valoracionCliente = valoracionCliente;
	}
	public Long getValoracionChofer() {
		return valoracionChofer;
	}
	public void setValoracionChofer(Long valoracionChofer) {
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
	public double getCantKm() {
		return cantKm;
	}
	public void setCantKm(double cantKm) {
		this.cantKm = cantKm;
	}
	public Long getIdChofer() {
		return idChofer;
	}
	public void setIdChofer(Long idChofer) {
		this.idChofer = idChofer;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Long getIdUsuarioMod() {
		return idUsuarioMod;
	}
	public void setIdUsuarioMod(Long idUsuarioMod) {
		this.idUsuarioMod = idUsuarioMod;
	}
	public Date getDtReserva() {
		return dtReserva;
	}
	public void setDtReserva(Date dtReserva) {
		this.dtReserva = dtReserva;
	}
	public Long getIdViaje2() {
		return idViaje2;
	}
	public void setIdViaje2(Long idViaje2) {
		this.idViaje2 = idViaje2;
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
	public Boolean getIsEliminado() {
		return isEliminado;
	}
	public void setIsEliminado(Boolean isEliminado) {
		this.isEliminado = isEliminado;
	}

}