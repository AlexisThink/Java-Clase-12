package mx.com.cetech.Clase12.Hilos;

public class CreacionHilo {

	public static void main(String[] args) {
		
		PrimerHilo primerHilo = new PrimerHilo();
		SegundoHilo segundoHilo = new SegundoHilo();
		
		primerHilo.start();
		segundoHilo.start();

	}

}
