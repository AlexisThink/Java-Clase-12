package mx.com.cetech.Clase12.Excepiones;

public class MalJefeExcepcion extends Exception{
	
	String miMalJefe;

	public MalJefeExcepcion(String miMalJefe) {
		this.miMalJefe = miMalJefe;
	}
	
	public String impresion (){
		return "excepcion atrapada porque la palabra es: " + miMalJefe;
	}
	

}
