package ejercicio25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pares {
	
	 List<Integer> numeros=new ArrayList<Integer>();
	  Scanner teclado=new Scanner(System.in);
		
	public  Pares(){
			System.out.println("Cuando numero quieres introducir");
			int op=teclado.nextInt();
			
			
			for (int i = 0; i < op; i++) {
				System.out.println("Escribe en numero de la  posicion:  "+(i+1));
				numeros.add(teclado.nextInt()); 
			}
			numeros.stream().filter(pares -> (pares%2)==0).forEach(num -> System.out.println("los numeros pares son: "+num));
			
			
		}
		
	

}
