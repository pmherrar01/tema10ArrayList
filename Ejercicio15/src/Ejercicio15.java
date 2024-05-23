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
    
    public static ArrayList<Empleado> getListaConTodosEmpleados(ArrayList<Empresa> lEmpresa){
        ArrayList<Empleado> lConTodos = new ArrayList<>();
        ArrayList<Empleado> lAux;
        for(int i = 0;i < lEmpresa.size();i++){
           lAux = lEmpresa.get(i).getlEmpleados();
           for(int j = 0;j < lAux.size();j++){
               lConTodos.add(lAux.get(j));
           }
        }
        return lConTodos;
    }
    
    public static void burbuja(ArrayList<Empleado> lConTodos){
        Empleado aux;
        for(int i = 0;i < lConTodos.size();i++){
            for(int j = 0;j < lConTodos.size()-1;j++){
                if  (lConTodos.get(j).getSueldo() > lConTodos.get(j+1).getSueldo()){
                    aux = lConTodos.get(j);
                    lConTodos.set(j, lConTodos.get(j+1));
                    lConTodos.set(j+1, aux);
                }
            }
        }
    }
    
    public static void ordenarPorSueldo(ArrayList<Empresa> lEmpresa){
        ArrayList<Empleado> lConTodos = getListaConTodosEmpleados(lEmpresa);
        burbuja(lConTodos);
        for(int i = 0;i < lConTodos.size();i++){
            lConTodos.get(i).mostrarEmpleado();
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
				ordenarPorSueldo(lEmpresa);
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
