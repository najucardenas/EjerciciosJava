package ejercicios22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EliminarPa {
	int op;
	List<String> palabras=new ArrayList<String>();
	Scanner teclado=new Scanner(System.in);
	
	public EliminarPa() {
		
		System.out.println("Escribe cuantas palabras quieres introducir");
		op=teclado.nextInt();
		
		
		for (int i = 0; i < op; i++) {
			System.out.println("Escribe la palabra: "+(i+1));
			palabras.add(teclado.next());
			}
		eliminarCadenas();
		imprimir1();
		
	}
	
	
	
	public void  eliminarCadenas() {

		Set<String> auxiliar=new HashSet<String>(palabras);
		palabras.clear();
		palabras.addAll(auxiliar);
	}
	
	public void imprimir1() {
		
		//if(palabras.contains()==false) {
			
			
		//}
		System.out.println("Lista sin  datos repetidos");
		for (String datos:palabras) {
			
			System.out.println(datos);
			}	
	}

}
