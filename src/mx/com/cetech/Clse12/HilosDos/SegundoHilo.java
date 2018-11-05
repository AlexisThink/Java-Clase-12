package mx.com.cetech.Clse12.HilosDos;

public class SegundoHilo {
	
	Thread segundoHilo;
	
	public SegundoHilo(){
		segundoHilo = new Thread("segundoHilo");
		segundoHilo.start();
	}
	
	public void run() {
		
		for(int i=0; i<=10; i++){
			System.out.println("Segundo hilo ó subproceso: " + segundoHilo.getName() + "Valor" + i);
		};
		
	}

}
