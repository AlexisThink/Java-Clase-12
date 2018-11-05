package mx.com.cetech.Clase12.Hilos;

public class SegundoHilo extends Thread{

	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println("Segundo hilo" + i);
		}
	}
	
	
	
}
