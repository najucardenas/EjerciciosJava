package reto;

public class Biblioteca {
	
		String id, titulo;
		
		String libro[][];
				
		public void libro() {
			
			libro=new String[2][15];
					
			libro[0][0]="id";
			libro[0][1]="libro";
		
			}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getTitulo() {
			return titulo;
		}



		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

}
