package mx.com.cetech.Clase12.Encapsulacion;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int calificacion;
	
	public Alumno() {
	}
	
	
	public Alumno(String nombre, String apellido, int calificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.calificacion = calificacion;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
	
}
