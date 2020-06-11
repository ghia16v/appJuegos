//POJO DE ENTIDAD JUEGO
package modelo;

public class Juego {
	
	private int idJuego;
	private String nombre;
	private int idConsola;
	private String imagen;
	
	
	//Constructor
	public Juego() {
		super();
		this.idJuego=0;
		this.nombre="";
		this.idConsola=0;
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


	public int getIdConsola() {
		return idConsola;
	}


	public void setIdConsola(int idConsola) {
		this.idConsola = idConsola;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	@Override
	public String toString() {
		return "Juego [idJuego=" + idJuego + ", nombre=" + nombre + ", idConsola=" + idConsola + ", imagen=" + imagen
				+ "]";
	}
	
	

	
}
