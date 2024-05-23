import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

	private String nombreEmpresa;
    private ArrayList<Empleado> lEmpleados;
	
    public Empresa() {
		this.nombreEmpresa = "";
		this.lEmpleados = new ArrayList<>();
	}
    
    public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.lEmpleados = new ArrayList<>();
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public ArrayList<Empleado> getlEmpleados() {
		return lEmpleados;
	}
	public void setlEmpleados(ArrayList<Empleado> lEmpleados) {
		this.lEmpleados = lEmpleados;
	}
	
    public void rellenarDatosEmpresas() {
    	Scanner entrada = new Scanner(System.in);
    	Scanner entrada1 = new Scanner(System.in);
    	String respuesta;
    	System.out.println("Nombre de la empresa: ");
    	this.nombreEmpresa=entrada.nextLine();
    	do {
    		Empleado empleado = new Empleado();
    		empleado.rellenarDatosEmpleado();
    		lEmpleados.add(empleado);
    		System.out.println("¿Desea añadir mas empleados?");
    		respuesta=entrada1.nextLine();
    	}while(respuesta.equalsIgnoreCase("si"));
    }
    
    public void mostrarEmpleado() {
    	int i;
    	for(i = 0; i<lEmpleados.size(); i++) {
    		System.out.println("     Empleado " + (i+1) +": " + lEmpleados.get(i).toString());
    	}
    }
    
    public void mostrarEmpleadosDeEmpresaConA(){
        for(int i = 0;i < this.lEmpleados.size();i++){
            if  (this.lEmpleados.get(i).getNombreEmpleado().contains("a")){  
                this.lEmpleados.get(i).mostrarEmpleado();
            }
        }
    }
	
}
