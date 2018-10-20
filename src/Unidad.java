
public class Unidad {
	private String placa;
	private String tipo;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Unidad [placa=" + placa + ", tipo=" + tipo + "]";
	}

}
