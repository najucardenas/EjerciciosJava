package ejercicio16;
import PedirDatos.*;
public class Determinar {
	int re,dato;
	boolean bandera=false;
	
	public Determinar(){
		PedirDatos pedir=new PedirDatos();
		dato=pedir.datos2();
		re=dato%2;
		
		
		if (re==0) {
			
			System.out.println("EL numero es par");	
			
		}else {
			
			
			System.out.println("EL numero no es par");	
			
		}
		
		
	
		
		primo();	
		
	}

public void primo() {
	//dato=dato-1;
	
	
	  for (int i=dato-1; i>1; i--) {
			
			re=dato%i;
			
			if(re==0) {
				bandera=true;
				i=1;
			}
		}
		

	
	
	if (bandera==false) {
		
		System.out.println("EL numero es primo");	
	}else
		
		System.out.println("EL numero no es primo");	
}
}
