package ejercicio18;

import java.util.Scanner;

public class factorial {
Scanner teclado=new Scanner(System.in);
int dato, dato2, factorial=1;
	public factorial(){
		System.out.println("Escribe  el numero para calcular el factorial");
		dato=teclado.nextInt();
		dato2=dato;
	
	while(dato>=1) {
		
		factorial=factorial*dato;
		dato--;
	}
	System.out.println("El factorial del numero "+dato2+" es "+ factorial);
	
	}
}
