
public class Asignatura {

	private String nombreAsignatura;
	private float notaAsignatura;
	
	public Asignatura() {
		this.nombreAsignatura = "";
		this.notaAsignatura = 0;
	}
	
	public Asignatura(String nombreAsignatura, float notaAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
		this.notaAsignatura = notaAsignatura;
	}
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public float getNotaAsignatura() {
		return notaAsignatura;
	}
	public void setNotaAsignatura(float notaAsignatura) {
		this.notaAsignatura = notaAsignatura;
	}
	
	
	
}
