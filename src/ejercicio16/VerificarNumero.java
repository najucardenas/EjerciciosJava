package ejercicio16;
import PedirDatos.*;
public class VerificarNumero {
	PedirDatos pedir=new PedirDatos();
	double Dato;
	public VerificarNumero(){
		
		
		Dato=pedir.datos3();
		
		
		if(Dato<0) {
			
			System.out.println("EL numero  es negativo");
			
		}else if(Dato>0) {
			System.out.println("EL numero  es positivo");
			
		}else {
			
			System.out.println("EL numero  es 0");
			
			
		}
		
		
		
		
		
		
	}	

}
