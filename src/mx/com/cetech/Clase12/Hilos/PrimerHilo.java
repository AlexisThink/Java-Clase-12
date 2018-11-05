package mx.com.cetech.Clase12.Hilos;

public class PrimerHilo extends Thread {
	
	
	/*
	 * HILO O SUBPROCESOS
	 * 
	 * CREAR UNA CLASE QUE HEREDE DE THREAD
	 * +CREA LA INSTNCIA DE ESA CLASE, LA CLASE QUE HEREDA DEBE REMPLZAR EL METODO RUN
	 * QUE ES EL METODO DE PARTDIA PARA EL NUEVO HILO
	 * 
	 * ESTA NUEVA CLASE CREADA DEBE LLAMAR AL METODO TART PRA LA EJECUCION DEL HILO 
	 * 
	 */
	
	public void run (){
		for(int i=0; i<=10; i++){
			System.out.println("Primer hilo" + i);
		}
	}

}
