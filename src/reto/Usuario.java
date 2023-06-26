package reto;

public class Usuario {

		String nombre, id, librosP, estado;
		
		String libro[][];
				
			
		
		public void libro() {
			
			libro=new String[3][10];
			libro[0][0]="nombre";
			libro[0][1]="id";
			libro[0][2]="librosP";
			}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getLibrosP() {
			return librosP;
		}



		public void setLibrosP(String librosP) {
			this.librosP = librosP;
		}



		public String getEstado() {
			return estado;
		}



		public void setEstado(String estado) {
			this.estado = estado;
		}



	
		
		
		

}
