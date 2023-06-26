package PedirDatos;

import java.util.Scanner;

public class PedirDatos {
	Scanner teclado=new Scanner(System.in);
	int dato;
	double dato1;
	
	
	
	public int datos1() {
		
	System.out.println("Escribe el año ");	
		dato=teclado.nextInt();
		return dato;
		
		
		
	}
	
	
	
	public int datos2() {
		
		System.out.println("Escribe el numero ");	
			dato=teclado.nextInt();
			return dato;
				
		}
	
public double datos3() {
		
		System.out.println("Escribe el numero ");	
			dato1=teclado.nextInt();
			return dato1;
			
			
			
		}

}
