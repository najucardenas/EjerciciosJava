package ejercicio16;
import PedirDatos.*;
import java.util.Scanner;

public class Bisiesto {
	Scanner teclado=new Scanner(System.in);
	PedirDatos pedir=new PedirDatos();
	int dato=0,bi;
	public Bisiesto(){
		
		
		
		dato=pedir.datos1();
		
		bi=dato%4;
				
				if(bi==0) {
					
					System.out.println("El año " +dato +" es  bisiesto");
			     }else
			    	 
			    	 System.out.println("El año " +dato +" no es bisiesto");
		
		
	}
	

}
