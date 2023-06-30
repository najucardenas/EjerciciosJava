package ejerecio19;

import java.util.Scanner;

public class Calculadora {
	Scanner teclado=new Scanner(System.in);
	int op=0;
	double dato1, dato2, resultado; 
    public Calculadora() {
	pedirDatos();	
	}
	
	public void menu() {	
	do {
	System.out.println("sumar dos numeros_____________1");	
	System.out.println("restar dos numeros____________2");
	System.out.println("dividir dos numeros___________3");
	System.out.println("multiplicar dos numeros_______4");
	System.out.println("Salir_________________________5");
	op=teclado.nextInt();	
	switch (op) {
	case 1:
		pedirDatos();
		suma( );
		break;
	case 2:
		pedirDatos();
		resta();
		break;
	case 3:
		pedirDatos();
		mul();
	break;
	case 4:
		pedirDatos();
		div();
	break;
         
	default:
		
		System.out.println("Opcion no valida");
		
		break;
	}
	}while(op!=4);	
	}


	public void pedirDatos() {
	System.out.println("Escribe el primer dato");
	dato1=teclado.nextDouble();
	System.out.println("Escribe el segundo dato");
	dato2=teclado.nextDouble();
		}
	
	
public void suma( ){
	 resultado=dato1+dato2;
	}
public void resta() {
	 resultado=dato1-dato2;
	}
public void div() {
	 resultado=dato1/dato2;
	}
public void mul() {
	 resultado=dato1*dato2;
	}

}
