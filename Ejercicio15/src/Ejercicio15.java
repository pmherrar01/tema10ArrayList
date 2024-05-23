import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio15 {

	public static void rellenarDatos(ArrayList<Empresa> lEmpresa) {
		Scanner entrada = new Scanner(System.in);
		String respuesta;
		do {
			Empresa empresa = new Empresa();
			empresa.rellenarDatosEmpresas();
			lEmpresa.add(empresa);
			System.out.println("Deseas añadir mas empresas");
			respuesta=entrada.nextLine();
		}while(respuesta.equalsIgnoreCase("si"));	
	}
	
	public static void mostrarEmpresas(ArrayList<Empresa> lEmpresa) {
		int i;
		for(i=0; i < lEmpresa.size(); i++) {
			System.out.println("Empresa: " + lEmpresa.get(i).getNombreEmpresa());
			lEmpresa.get(i).mostrarEmpleado();
		}
	}
    public static void mostrarEmpleadosConA(ArrayList<Empresa> lEmpresa){
        Iterator<Empresa> it = lEmpresa.iterator();
        Empresa empresaAux;
        while(it.hasNext()){
            empresaAux = it.next();
            empresaAux.mostrarEmpleadosDeEmpresaConA();
        }
    }

	public static void menu(ArrayList<Empresa> lEmpresa) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("1- Añadir empresas y empleados");
			System.out.println("2- Mostrar empresas y empleados");
			System.out.println("3- Mostrar nombre cuyo nombre contengan la letra 'A'");
			System.out.println("4- Mostrar todos los empleados ordenados por el sueldo");
			System.out.println("5- Salir");
			System.out.print("      Opcion:");
			num=entrada.nextInt();

			switch(num) {
			case 1:
				rellenarDatos(lEmpresa);
				break;
			case 2:
				mostrarEmpresas(lEmpresa);
				break;
			case 3:
				mostrarEmpleadosConA(lEmpresa);
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}while(num!=5);
	}

	public static void main(String[] args) {
		ArrayList<Empresa> lEmpresa = new ArrayList<>();
		menu(lEmpresa);

	}

}
