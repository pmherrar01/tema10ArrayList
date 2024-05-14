
public class Alumno {

	private String nombre;
	private int Curso;
	
	public Alumno() {
		this.nombre = "";
		Curso = 0;
	}
	
	public Alumno(String nombre, int curso) {
		this.nombre = nombre;
		Curso = curso;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return Curso;
	}

	public void setCurso(int curso) {
		Curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", Curso=" + Curso + "]";
	}
	
	
	
}
