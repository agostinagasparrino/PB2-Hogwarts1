package hogwarts;

public class Animal implements Hechizable {

	private String estado;
	
	@Override
	public String getEstado() {
		return this.estado;
	}

	@Override
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
