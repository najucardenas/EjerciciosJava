package Ejerciciosdia15;

public class Conversion {
	double resultado;
	
	   PedirDatos datos=new PedirDatos();
	
double  soles, pesos, dolares, quetsales;
Conversion(int opcion){
	
	switch (opcion) {
	case 1:
		PesoDolar(datos.pedir3()); 
		
		
		break;
case 2:
	PesoQuetzal(datos.pedir3());
		break;
case 3:
	PesoSol(datos.pedir3());
	break;
case 4:
	DolaPeso(datos.pedir3());
	break;
case 5:
	DolarQuetzal(datos.pedir3());
	break;
case 6:
	Dolarsol(datos.pedir3());
	break;
case 7:
	SolDolar(datos.pedir3());
	break;
case 8:
	SolQuetzal(datos.pedir3());
	break;
case 9:
	SolPeso(datos.pedir3());
	break;
case 10:
	QuetzalPeso(datos.pedir3());
	break;
   case 11:
	QuetzalDolar(datos.pedir3());
	break;
    case 12:
	Quetzalsol(datos.pedir3());
	break;

	default:
		break;
	}
	
	
	System.out.println(" La conversion es: "+(float)resultado);
	
}
	
	
	public void SolPeso(double dato1 ) {
		
		resultado=(float)(dato1*4.76);	
		
		
		}
	public void SolDolar(double dato1) {
		 resultado=(float)(dato1*0.28);		
	}
	public void SolQuetzal(double dato1) {
		 resultado=(float)(dato1*2.16);	
	}
	public void PesoSol(double dato1) {
    resultado=(float)(dato1*0.21);	
	}
	public void PesoDolar(double dato1) {
		 resultado=(float)(dato1*0.058);	
	}
    public void PesoQuetzal(double dato1) {
    	
    	 resultado=(float)(dato1*0.45);	
	}
     
    public void Dolarsol(double dato1) {
    	 resultado=(float)(dato1*3.16);
	}
    
    public void DolaPeso(double dato1) {
    	 resultado=(float)(dato1*17.16);
	}
    public void DolarQuetzal(double dato1) {
    	 resultado=(float)(dato1*7.79);		
    	
	
    }
    
   public void Quetzalsol(double dato1) {
	    resultado=(float)(dato1*0.46);		
	}
    
    public void QuetzalPeso(double dato1) {
    	  resultado=(float)(dato1*2.20);
	}
    public void QuetzalDolar(double dato1) {
    	 resultado=(float)(dato1*0.13);
    
    }
	
	
	
	

}
