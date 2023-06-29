package ejercicio18;

import java.util.Scanner;

public class NumeroNegativo {
	Scanner teclado=new Scanner(System.in);
	int dato;
	
	public NumeroNegativo(){
		do {
			
			System.out.println("Escieb un numero ");
		dato=teclado.nextInt();
		}while(dato>-5);	
		
	}
}
