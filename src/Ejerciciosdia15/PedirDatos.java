package Ejerciciosdia15;

import java.util.Scanner;

public class PedirDatos {
Scanner teclado=new Scanner(System.in);	
	
public double pedir1() {
	
	System.out.println("Dame el precio");	
	double precio=teclado.nextDouble();
	return precio;
}
public int pedir2() {
	
	System.out.println("Elije un opcion");	
	int op=teclado.nextInt();
	return op;
}
public double pedir3() {
	
	System.out.println("dame el monto");	
	int monto=teclado.nextInt();
	return monto;
}
	

}
