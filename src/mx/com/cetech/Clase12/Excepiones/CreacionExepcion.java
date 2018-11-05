package mx.com.cetech.Clase12.Excepiones;

public class CreacionExepcion {

	static void usuarioMalaPalabra(String mPalabra) throws MalJefeExcepcion {
		
		if (mPalabra.equals("Alejandra")){
			throw new MalJefeExcepcion(mPalabra);
			}else{
				System.out.println("Buen Jefe");
			}
	}
	
	
	
	public static void main(String[] args)  {
		try {
			usuarioMalaPalabra("zxg");
			usuarioMalaPalabra("Alejandra");
		} catch (MalJefeExcepcion e) {
			System.out.println("el mal jefe es "+e.impresion());
		}
	
		
	}

	
	
}
