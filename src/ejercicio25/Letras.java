package ejercicio25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Letras {
	
	
	List<String> numeros=new ArrayList<String>();
	  Scanner teclado=new Scanner(System.in);
		
	public  Letras(){
			System.out.println("Cuando palabras quieres introducir");
			int op=teclado.nextInt();
			
			
			for (int i = 0; i < op; i++) {
				System.out.println("Escribe la palabra de la  posicion:  "+(i+1));
				numeros.add(teclado.next()); 
			}
			System.out.println("Las palabras que tiene mas de 4 lestras son: ");
			numeros.stream().filter(pares -> (pares.length()>4)).forEach(num -> System.out.println(num));
			
			
		}

}
