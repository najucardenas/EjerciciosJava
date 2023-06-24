package Ejerciciosdia15;

public class Menu {
	PedirDatos datos=new PedirDatos();
	
	
public void menu1() {
	
		System.out.println("Conversion de monedas");
		System.out.println("Conversion de pesos a dolares           1");
		System.out.println("Conversion de pesos a quetzales         2");
		System.out.println("Conversion de pesos a soles             3");
		System.out.println("Conversion de dolares a pesos           4");
		System.out.println("Conversion de dolares a quetzales       5");
		System.out.println("Conversion de dólares a soles           6");
		System.out.println("Conversion de soles a dolares           7");
		System.out.println("Conversion de soles a quetzales         8");
		System.out.println("Conversion de soles a pesos             9");
		System.out.println("Conversion de quetzales a pesos         10");
		System.out.println("Conversion de quetzales a dolares       11");
		System.out.println("Conversion de quetzales a soles         12");
		
		Conversion cal=new Conversion(datos.pedir2());
		
		}


public void menu() {

	System.out.println("Escibe el monto a convertir");
	
	datos.pedir2();
	

}


}
