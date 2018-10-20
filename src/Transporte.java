
public class Transporte {
	private Pasajero pasajero;
	private Unidad unidad;
	
	
	
	
	private Modalidad modalidad;

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "Transporte [pasajero=" + pasajero + ", unidad=" + unidad + ", modalidad=" + modalidad + "]";
	}

}
