
public class Modalidad {
	private String tipo;
	private String clase;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Modalidad [tipo=" + tipo + ", clase=" + clase + "]";
	}

}
