package mx.com.cetech.Clse12.HilosDos;

public class PrimerHilo implements Runnable{

	
	Thread hiloUno;
	
	public PrimerHilo() {
		hiloUno = new Thread(this,"hiloUno");
		hiloUno.start();
	}

	@Override
	public void run() {
		
		for(int i=0; i<=10; i++){
			System.out.println("Primer hilo ó subproceso: " + hiloUno.getName() + "Valor" + i);
		};
		
	}

}
