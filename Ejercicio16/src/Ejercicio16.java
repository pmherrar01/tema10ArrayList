import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio16 {

	public static void rellenarProducto(ArrayList<Producto> lProductos) {
		Scanner entrada= new Scanner(System.in);
		String respuesta;
		do {
			Producto producto = new Producto();
			producto.introducirDatos();
			lProductos.add(producto);
			System.out.println("Quieres introducir otro producto: ");
			respuesta = entrada.nextLine();
		}while(respuesta.equalsIgnoreCase("si"));
	}
	
	public static void mostrarProductos(ArrayList<Producto> lProductos) {
		for(Producto producto : lProductos) {
			producto.mostrarDatos();
		}
	}
	
	public static void borrarProducto(ArrayList<Producto> lProductos) {
		Scanner entrada = new Scanner(System.in);
		String productoBorrar;
		int i;
		System.out.print("Que producto deseas borrar: ");
		productoBorrar=entrada.nextLine();
		for(i = 0; i < lProductos.size(); i++) {
			if(productoBorrar.equalsIgnoreCase(lProductos.get(i).getNombreProducto())) {
				lProductos.remove(i);
			}
		}
	}
	
	public static void comprarProductos(ArrayList<Producto> lProductos) {
		mostrarProductos(lProductos);
	}
	
	public static void menuAdministracion(ArrayList<Producto> lProductos) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU ADMINISTRACION--------");
			System.out.println("1- Introducir productos");
			System.out.println("2- Mostrar productos");
			System.out.println("3- Eleminar productos");
			System.out.println("4- Volver al menu principal");
			System.out.print("     Opcion: ");
			num=entrada.nextInt();
			
			switch(num){
			case 1:
				rellenarProducto(lProductos);
				break;
			case 2:
				mostrarProductos(lProductos);
				break;
			case 3:
				borrarProducto(lProductos);
				break;
			case 4:
				menu(lProductos);
				break;
			}
			
		}while(num!=4);
	}
	
	public static void menuCompra(ArrayList<Producto> lProductos) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU COMPRA--------");
			System.out.println("1- Comprar productos");
			System.out.println("2- Volver al menu principal");
			System.out.print("     Opcion: ");
			num=entrada.nextInt();
			switch(num) {
			case 1:
				
				break;
			case 2:
				menu(lProductos);
				break;
			}
		}while(num!=2);
	}
	
	public static void menu(ArrayList<Producto> lProductos) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU--------");
			System.out.println("1- MENU DE ADMINISTRACION");
			System.out.println("2- MENU DE COMPRA");
			System.out.println("3- SALIR");
			System.out.print("     Opcion: ");
			num=entrada.nextInt();
			switch(num) {
			case 1: 
				menuAdministracion(lProductos);
				break;
			case 2:
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=3);
	}
	
	public static void main(String[] args) {
		ArrayList<Producto> lProductos = new ArrayList<>();
		menu(lProductos);
	}

}
