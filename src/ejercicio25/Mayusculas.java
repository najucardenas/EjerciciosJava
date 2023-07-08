package ejercicio25;

import java.util.Scanner;
import java.util.function.Function;

public class Mayusculas {
	String cadenas,t;
	int t1=10;
	Scanner teclado=new Scanner(System.in);
	public Mayusculas(){
		
		
		
		System.out.println("Es cribe la palabra en minusculas ");
		cadenas=teclado.next();
		Function<String, String> cadenas1= (cad)-> (cad.toUpperCase());
		
		//Function<Integer, Integer> cadena= (cad)-> cad*2;
		//for(String n: cad) {
		t=cadenas1.apply(cadenas);
		//	}
		
		System.out.println("La cadena en mayusculas es "+t);
		
		
		
	}

}
