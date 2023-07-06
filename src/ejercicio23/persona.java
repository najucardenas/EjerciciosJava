package ejercicio23;

import java.util.ArrayList;
import java.util.List;

public class persona {
	
private String nombre;
private int edad;

public persona(String nombre, int edad) {
	this.nombre=nombre;
	this.edad=edad;
	
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}


}
