package mx.com.cetech.Clase12.ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_CONECTION = "jdbc:mysql://localhost:3306/Cetech";
	//JDBC: TIPO CONEXION ://IP PUERTO/DATABASE (BASE DE T¿DATOS)
	private final String DB_USER = "AlexisThink";
	private final String DB_PASSWORD = "0123";
	
	public Connection getDBConnection() {
		Connection dbConection = null;
		
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el driver");
		}
		
		try {
			dbConection = DriverManager.getConnection(DB_CONECTION, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			System.out.println("Error al conectarsea Base de Datos");
			e.printStackTrace();
		}
		
		return dbConection;
	}
	
	
	
}
