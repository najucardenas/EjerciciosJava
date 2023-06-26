package Ejerciciosdia15;

public class Calculadora {
	double total,total2,total3;
   public void calcularIva(){
	   PedirDatos datos=new PedirDatos();
	   
	   
	   double precio=datos.pedir1();
	   total=precio*0.16;
	   total=total+precio;
	   
	   if(precio>50) {
		   
		   total2=total*.10;
		   total3=total-total2;
		   
	   }else {
		   
		   total2=total*.05;
		   total3=total-total2;
	   }
		   
	   
	 System.out.println("El total es:  "+ total); 
	 System.out.println("El total  con descuento es:  "+ total3);  
	   
   }
    
    
    
    
}
