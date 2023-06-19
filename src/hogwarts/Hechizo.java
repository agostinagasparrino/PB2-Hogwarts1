package hogwarts;

import java.util.Objects;

public class Hechizo implements Comparable<Hechizo> {
	
	private String nombre;
	
	public Hechizo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hechizo other = (Hechizo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Hechizo otro) {
		return this.nombre.compareTo(otro.nombre);
	}

	public void aplicarHechizo(Hechizable objeto) {
		
		switch(this.nombre) {
		case "expelliarmus":
			objeto.setEstado("Me desarmaron");
			break;
		case "enormuvus":
			objeto.setEstado("Ahora soy más grande");	
			break;
		default:
			break;
		}
		
	}

}
