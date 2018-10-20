
public class Application_Transporte {

	public static void main(String[] args) {
		Transporte transporte = new Transporte();

		transporte.setModalidad(construirModalidad());
		transporte.setPasajero(construirPasajero());
		transporte.setUnidad(construirUnidad());
		
		System.out.println(transporte);

	}

	private static Pasajero construirPasajero() {

		Pasajero pasajero = new Pasajero();
		pasajero.setNombre("Manuel");
		pasajero.setTipo("Adulto");
		return pasajero;
	}

	private static Unidad construirUnidad() {
		Unidad unidad = new Unidad();
		unidad.setPlaca("AC1234");
		unidad.setTipo("Primera Clase");
		return unidad;

	}

	private static Modalidad construirModalidad() {
		Modalidad modalidad = new Modalidad();
		modalidad.setClase("Turista");
		modalidad.setTipo("Nacional");
		return modalidad;
	}

}
