import java.util.Scanner;

public class Alumno {

	private String nombre;
	private int curso;
	
	public Alumno() {
		this.nombre = "";
		this.curso = 0;
	}
	
	public Alumno(String nombre, int curso) {
		this.nombre = nombre;
		this.curso = curso;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		curso = curso;
	}

	@Override
	public String toString() {
		return "nombre : " + nombre + ", Curso : " + curso;
	}
	
	
	
}
