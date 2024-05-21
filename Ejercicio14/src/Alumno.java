import java.util.Scanner;

public class Alumno {
	
	private String nombreAlumno;
	private Asignatura[] vAsignaturas;
	
    public Alumno(){
        this.nombreAlumno = "";
        this.vAsignaturas = new Asignatura[3];
    }
    
    public Alumno(String nombreAlumno){
        this.nombreAlumno = nombreAlumno;
        this.vAsignaturas = new Asignatura[3];
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombre(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
	
	public void  rellenarAsignatura() {
		Scanner entrada = new Scanner(System.in);
		String[] vNombres = {"Lengua", "Mates", "Fisica"};
		int i;
		float nota;
		System.out.println("Notas de " + this.nombreAlumno + ":");
		for(i = 0; i < this.vAsignaturas.length;i++) {
			System.out.print("    " + vNombres[i] + ": ");
			nota=entrada.nextFloat();
			this.vAsignaturas[i] = new Asignatura(vNombres[i],nota);
		}		
	}
	
	public void mostrarAlumno() {
		int i;
		System.out.println(this.nombreAlumno+": ");
		for(i=0;i < this.vAsignaturas.length;i++) {
			System.out.println("   " + vAsignaturas[i].toString());
		}
	}
    public float getTotalNotas(){
        float suma = 0;
        for(int i = 0;i < this.vAsignaturas.length;i++){
            suma = suma + this.vAsignaturas[i].getNotaAsignatura();
        }
        return suma;
    }
    
    public int asignaturaDificil() {
    	int i,suspensos=0;
    	for(i=0; i < vAsignaturas.length;i++) {
    		if(vAsignaturas[i].getNotaAsignatura()<5) {
    			suspensos++;
    		}
    	}
    	return suspensos;
    }
}
