package Ejerciciosdia15;

public class Calculadora {
	double total;
   public void calcularIva(){
	   PedirDatos datos=new PedirDatos();
	   
	   
	   double precio=datos.pedir1();
	   
	   
	   if(precio>50) {
		   
		   total=precio*0.10;
		   total=total+precio;
		   
	   }else {
		   
		  total=precio*0.05;
		  total=total+precio;
		   
	   }
		   
	   
	 System.out.println("El total es:  "+ total);  
	   
   }
    
    
    
    
}
