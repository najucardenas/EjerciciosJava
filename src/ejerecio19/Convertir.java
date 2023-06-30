package ejerecio19;

import java.util.Scanner;

public class Convertir {
	Scanner teclado=new Scanner(System.in);
	String semana[]= {"Lunes","Martes","Miercoles","Jueves","Viernes"};
	
	int dia;
	public Convertir() {
		
		System.out.println("Escribe  un numero del dia de la  semana");
		dia=teclado.nextInt();
		dias();
		
		}
		
	
		
	public void  dias() {
		
		switch (dia) {
		case 1:
			System.out.println("El Día es Lunes");
			break;
		case 2:
			System.out.println("El Día es Martes");
			break;
		case 3:
			System.out.println("El Día es Miercoles");
			break;
		case 4:
			System.out.println("El Día es Jueves");
			break;
		case 5:
			System.out.println("El Día es Viernes");
			break;
		case 6:
			System.out.println("El Día es Sabado");
			break;
		case 7:
			System.out.println("El Día es Domingo");
			break;

		default:
			System.out.println("Ese numero no pertenece a ningún día de la semana");
			break;
		
	}	
		
		}

}
