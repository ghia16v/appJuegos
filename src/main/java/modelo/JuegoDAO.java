package modelo;

import java.util.ArrayList;

public interface JuegoDAO extends CrudAble<Juego>{

	ArrayList<Juego> getAllByNombre( String nombre );
	
	ArrayList<Juego> getAllRangoPrecio( int precioMinimo, int precioMaximo );
	

}
