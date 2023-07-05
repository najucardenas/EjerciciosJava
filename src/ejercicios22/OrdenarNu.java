package ejercicios22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class OrdenarNu {
	List<Integer> numeros=new ArrayList<Integer>();
	Scanner teclado=new Scanner(System.in);
	int numeros1[]=new int[5];
	
	
	public OrdenarNu(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Escribe el numero de la posicion "+(i+1));
			numeros1[i]=teclado.nextInt();
			}
		
		Arrays.sort(numeros1);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(" " +numeros1[i]);
		
			}
		
		
	}
	

}
