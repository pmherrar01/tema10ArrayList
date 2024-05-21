
public class Alumno {
	
	private String nombreAlumno;
	private Asignatura[] vAsignaturas;
	
	public Alumno() {
		this.nombreAlumno = "";
		this.vAsignaturas = new Asignatura[3];
	}
	
	public Alumno(String nombreAlumno, Asignatura[] vAsignaturas) {
		this.nombreAlumno = nombreAlumno;
		this.vAsignaturas = vAsignaturas;
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public Asignatura[] getvAsignaturas() {
		return vAsignaturas;
	}
	public void setvAsignaturas(Asignatura[] vAsignaturas) {
		this.vAsignaturas = vAsignaturas;
	}
	
	
}
