package reto;

public class Libro {
	String titulo, autor, fechaP, estado;
	
	String libro[][];
			
		
	
	public void libro() {
		
		libro=new String[4][10];
				
		libro[0][0]="titulo";
		libro[0][1]="autor";
		libro[0][2]="fechaP";
		libro[0][2]="estado";
		}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getFechaP() {
		return fechaP;
	}



	public void setFechaP(String fechaP) {
		this.fechaP = fechaP;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



}
			
			


