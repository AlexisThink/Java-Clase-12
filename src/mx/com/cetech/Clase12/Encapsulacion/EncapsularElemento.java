package mx.com.cetech.Clase12.Encapsulacion;

public class EncapsularElemento {

	public static void main(String[] args) {
		
		Alumno alumno  = new Alumno();
		
		Alumno otroAlumno = new Alumno("Alexis", "Olveres", 8);
		
		System.out.println(otroAlumno.getNombre() + otroAlumno.getApellido() + otroAlumno.getCalificacion());

	}

}
