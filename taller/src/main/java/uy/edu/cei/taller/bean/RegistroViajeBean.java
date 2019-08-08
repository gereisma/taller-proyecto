package uy.edu.cei.taller.bean;

public class RegistroViajeBean {

	 private int idRegistro ;
     private int idViaje ;
 
     private ViajeBean  Viajes ;

	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public int getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}

	public ViajeBean getViajes() {
		return Viajes;
	}

	public void setViajes(ViajeBean viajes) {
		Viajes = viajes;
	}

}