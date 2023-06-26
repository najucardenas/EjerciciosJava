package ejerccio3num;
import PedirDatos.*;

public class DosMayores {
	int dato1,dato2,dato3;
	double resultado1,resultado2,resul;
	PedirDatos datos=new PedirDatos();
	
	public void compara() {
		
		dato1=datos.datos2();
		dato2=datos.datos2();
		dato3=datos.datos2();
		
		if(dato1<dato2 && dato1<dato3) {
			
			resultado1=dato2%dato3;
			//resultado2=dato3%2;
			if(resultado1==0) {
				System.out.println("ES cero el residuo ");
				resul=dato1;
			}
			
			
			
		}
	
		if(dato2<dato1 && dato2<dato3) {
			resultado1=dato1%dato3;
			//resultado2=dato3%2;
			if(resultado1==0) {
				System.out.println("ES cero el residuo ");
				resul=dato2;
			}
		}
	
		if(dato3<dato1 && dato3<dato2) {
			
			resultado1=dato1%dato2;
			if(resultado1==0) {
				System.out.println("ES cero el residuo ");
				resul=dato3;
			}
			//resultado2=dato2%2;
			
		}
		
		
		System.out.println("El resultado de la divisiones: " +resultado1);
		System.out.println(" La suma del mas el número inferior que quedo de los primeros 3 numero " +(float)(resultado1+resul));
		
		
		
	}
	
	
	
	
	
	
	

}
