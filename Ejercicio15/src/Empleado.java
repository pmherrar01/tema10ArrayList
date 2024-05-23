import java.util.Scanner;

public class Empleado {

	private String nombreEmpleado;
	private int sueldo;
	
	public Empleado() {
		this.nombreEmpleado = "";
		this.sueldo = 0;
	}
	
	public Empleado(String nombreEmpleado, int sueldo) {
		this.nombreEmpleado = nombreEmpleado;
		this.sueldo = sueldo;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public void rellenarDatosEmpleado() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Nombre del empleado: ");
		this.nombreEmpleado=entrada.nextLine();
		System.out.println("Sueldo: ");
		this.sueldo=entrada1.nextInt();
	}
	
    public void mostrarEmpleado(){
        System.out.println("     "+this.nombreEmpleado+": "+this.sueldo+"");
    }

	@Override
	public String toString() {
		return  nombreEmpleado + "\n      Sueldo:" + sueldo;
	}
	
	
}
