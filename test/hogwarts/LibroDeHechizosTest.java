package hogwarts;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroDeHechizosTest {

	@Test
	public void queSepuedaAgregarUnHechizoAlLibro(){
	LibroDeHechizos libro = new LibroDeHechizos();
	Hechizo desarme = new Expelliarmus();
	libro.agregarHechizo(desarme) ;
	assertEquals(desarme, libro.buscar("expelliarmus"));
	}
	
	@Test
	public void queNoSepuedaAgregarUnHechizoQueYaEstabaEnElLibro(){
		
	final Boolean VALOR_ESPERADO = false;
	LibroDeHechizos libro = new LibroDeHechizos();
	Hechizo desarme = new Expelliarmus();
	Hechizo nuevo = new Hechizo("expelliarmus");
	libro.agregarHechizo(desarme);
	final Boolean VALOR_OBTENIDO = libro.agregarHechizo(nuevo);
	
	assertEquals(VALOR_ESPERADO,VALOR_OBTENIDO);
	assertTrue(libro.getCantDeHechizos().equals(1));
	assertEquals(desarme, libro.buscar("expelliarmus"));
	}
	
	@Test
	public void queSepuedaMostrarElLibroDeHechizosAlfabeticamente(){
		
	LibroDeHechizos libro = new LibroDeHechizos();
	Hechizo nuevo1 = new Hechizo("expelliarmus");
	Hechizo nuevo2 = new Hechizo("alohomora");
	Hechizo nuevo3 = new Hechizo("flipendo");
	Hechizo nuevo4 = new Hechizo("crucio");
	Hechizo nuevo5 = new Hechizo("incarcerus");
	
	libro.agregarHechizo(nuevo1);
	libro.agregarHechizo(nuevo2);
	libro.agregarHechizo(nuevo3);
	libro.agregarHechizo(nuevo4);
	libro.agregarHechizo(nuevo5);

	assertEquals(libro.mostrarHechizos().first(),nuevo2);
	assertEquals(libro.mostrarHechizos().last(),nuevo5);
	}
	
	@Test 
	 public void verSiUnHechizableEstaHechizado(){ 
	  LibroDeHechizos libro = new LibroDeHechizos(); 
	  Expelliarmus desarme = new Expelliarmus(); 
	  Hechizable perro = new Animal();   
	  libro.agregarHechizo(desarme); 
	  Hechizo hechizo = libro.buscar("expelliarmus"); 
	  hechizo.aplicarHechizo(perro); 
	  assertEquals("Me desarmaron", perro.getEstado()); 
	 } 
	
	@Test 
	 public void verSiUnHechizableCrece() { 
	  LibroDeHechizos libro = new LibroDeHechizos(); 
	  Hechizo crecer = new Agrandar("enormuvus"); 
	  Hechizable mesa = new Mueble();   
	  libro.agregarHechizo(crecer); 
	  Hechizo hechizo =libro.buscar("enormuvus"); 
	  hechizo.aplicarHechizo(mesa); 
	  assertEquals("Ahora soy más grande", mesa.getEstado()); 
	 } 
}
