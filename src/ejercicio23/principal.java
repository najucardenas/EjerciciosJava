package ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList persona=new ArrayList();
		
		//persona person=new persona();
		
		List<persona> personas=new ArrayList<>();
		personas.add(new persona("Juan",25));
		personas.add(new persona("Jose",35));
		personas.add(new persona("Lupe",40));
		personas.add(new persona("Pablo",18));
		
		
		List<persona>personamayor=filtrarperona(personas, p-> p.getEdad()>30);
		for (persona perso:personamayor) {
			System.out.println(perso.getNombre());
		}
	}
	
	
		public static List<persona> filtrarperona(List<persona> lista, Filtro<persona> filtro){
			List<persona> tesultado=new ArrayList<>();
			
			
			for(persona per:lista) {
				if (filtro.cumple(per)) {
					tesultado.add(per);
				}
				
			}
			return tesultado;
		}
		
		
	
	
		

	
	
	interface Filtro<T>{
		
	boolean cumple(T objeto);	
	}

}
