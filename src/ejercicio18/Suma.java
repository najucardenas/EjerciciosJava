package ejercicio18;

import java.util.Scanner;

public class Suma {
	Scanner teclado=new Scanner(System.in);
	int dato;
	String dato1; 
	int suma1=0;
	public Suma(){
		do {
			
			System.out.println("Escieb un numero para sumar ");
			int dato=teclado.nextInt();
			suma1=suma1+dato;
			System.out.println("Quiere seguir ingresando números S/N");
			dato1=teclado.next();
		}while(dato1.equalsIgnoreCase("S"));	
		
		System.out.println("La suma es:  "+suma1);
		
	}
	
	
	

}
