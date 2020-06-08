//POJO DE ENTIDAD JUEGO
package modelo;

public class Juego {
	
	private int idJuego;
	private String nombre;
	private String consola;
	
	//Constructor
	public Juego() {
		super();
		this.idJuego=0;
		this.nombre="";
		this.consola="";
	}
	
	public Juego(String nombre) {
		this();
		this.nombre=nombre;
	}

	public int getIdJuego() {
		return idJuego;
	}

	public void setIdJuego(int idJuego) {
		this.idJuego = idJuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	@Override
	public String toString() {
		return "Juego [idJuego=" + idJuego + ", nombre=" + nombre + ", consola=" + consola + "]";
	}
	
	

}
