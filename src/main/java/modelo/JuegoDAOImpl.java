package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JuegoDAOImpl implements JuegoDAO{
	
	private static JuegoDAOImpl INSTANCE = null;
		
		//CONSTRUCTOR	
		private JuegoDAOImpl() {
			super();	
		}
		
		//Patrón singleton
		public static synchronized JuegoDAOImpl getInstance() {
			
			if ( INSTANCE == null ) {
				INSTANCE = new JuegoDAOImpl();
			}
			
			return INSTANCE;
		}
		
		//SQL
		// excuteQuery => ResultSet
		private final String SQL_GET_ALL = " SELECT idJuego, nombre, idConsola, imagen  FROM exclusivos ORDER BY idJuego ASC; ";
		private final String SQL_GET_BY_ID = " SELECT idJuego, nombre, idConsola, imagen FROM exclusivos WHERE idJuego = ? ; ";
			
		// excuteUpdate => int numero de filas afectadas
		private final String SQL_INSERT = " INSERT INTO exclusivos (nombre, idConsola, imagen) VALUES ( ? , ?, ?) ; ";	
		private final String SQL_UPDATE = " UPDATE exclusivos SET nombre = ?, imagen = ?, idConsola = ? WHERE idJuego = ? ; ";
		private final String SQL_DELETE = " DELETE FROM exclusivos WHERE idJuego = ? ; ";
		
		
		
		
		
		//MÉTODOS HEREDADOS DE LA INTERFAZ		
		@Override
		public ArrayList<Juego> getAllByNombre(String nombre) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		@Override
		public ArrayList<Juego> getAll() {
			
			ArrayList<Juego> exclusivos = new ArrayList<Juego>();
			
			try (
					Connection conexion = ConnectionManager.getConnection();
					PreparedStatement pst = conexion.prepareStatement(SQL_GET_ALL);
					ResultSet rs = pst.executeQuery();
					
				) {
				
				while ( rs.next() ) {
					
					int idJuego        = rs.getInt("idJuego");
					String nombre = rs.getString("nombre");
					int idConsola = rs.getInt("idConsola");
					String imagen = rs.getString("imagen");
					
					Juego j = new Juego(nombre);
					j.setIdJuego(idJuego);
					j.setIdConsola(idConsola);
					j.setImagen(imagen);
									
					// guardar en lista
					exclusivos.add(j);
					
				} // while
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			return exclusivos;
		}
	
		@Override
		public Juego getById(int id) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public Juego delete(int id) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public Juego insert(Juego pojo) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public Juego update(Juego pojo) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
	
		
	
		@Override
		public ArrayList<Juego> getAllRangoPrecio(int precioMinimo, int precioMaximo) {
			// TODO Auto-generated method stub
			return null;
		}

}
