package hogwarts;

public class Mueble implements Hechizable {
	
	private String estado = "Sin hechizar";

	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	@Override
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
