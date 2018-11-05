package mx.com.cetech.Clase12.ConexionDB;

import java.sql.Connection;

public class Principal {

	public static void main(String[] args) {
		
		Connection miConexion;
		
		miConexion = new ConexionBD().getDBConnection();
		
		if(miConexion != null){
			System.out.println("Conexion Correcta! Campeon, you are the cham-pi-Onnnnn!!!!!");
		}
		else{
			System.out.println("Conxxion Fallida, LOOOOOOOSER!!!!!");
		}
		
	}

}
