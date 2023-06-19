package hogwarts;

import java.util.Iterator;
import java.util.TreeSet;

public class LibroDeHechizos {

	TreeSet<Hechizo> hechizos = new TreeSet<Hechizo>();
	
	public Boolean agregarHechizo(Hechizo desarme) {
		
		return this.hechizos.add(desarme);
	}

	public Hechizo buscar(String nombre) {
		
		Iterator<Hechizo> iterador = this.hechizos.iterator();
		
		while( iterador.hasNext() ) {
			  Hechizo hechizo = iterador.next();
			  if(hechizo.getNombre().equals(nombre)) {
					return hechizo;
				}
			}
		return null;
	}

	public Integer getCantDeHechizos() {
		return this.hechizos.size();
	}

	public TreeSet<Hechizo> mostrarHechizos() {
		
		return this.hechizos;
	}

}
