package mx.com.cetech.Clase12.Excepiones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepasoTryCach {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		
		
		try {int numeroUsuario = teclado.nextInt();
		System.out.println("Siguiente linea");
		
		} catch(InputMismatchException a){
			System.out.println("****");
		} 
		
		
		
		catch (Exception e) {
			System.out.println("El error es: ");
		}
		

	}

}
