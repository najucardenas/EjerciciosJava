package ejerecio19;

import java.util.Scanner;

public class MenuComida {
	
	Scanner teclado=new Scanner(System.in);
	String semana[]= {"Lunes","Martes","Miercoles","Jueves","Viernes"};
	
	int dia;
	int op;
	public MenuComida() {
		menu();
		}
	
		public void menu() {	
			do {
			System.out.println("Menu__________________________1");	
			System.out.println("Menu__________________________2");
			System.out.println("Manu__________________________3");
			System.out.println("Menu__________________________4");
			System.out.println("Menu__________________________5");
			System.out.println("Salir_________________________6");
			op=teclado.nextInt();
				
			
				
			switch (op) {
			case 1:
				System.out.println("Pescado a la diabla");
				break;
			case 2:
				System.out.println("Pescado Frito");
				//pedirDatos();
				//resta();
				break;
			case 3:
				System.out.println("Pozole");
				//pedirDatos();
				//mul();
			break;
			case 4:
				System.out.println("Enchiladas");
				//pedirDatos();
				//div();
			break;
			case 5:
				System.out.println("Mole con pollo");
				//pedirDatos();
				//div();
			break;
		         
			default:
				
				System.out.println("Opcion no valida");
				
				break;
			}
			}while(op!=4);	
			}
		
		
}
