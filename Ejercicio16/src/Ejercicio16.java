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
	
	public static void menuAdministracion(ArrayList<Producto> lProductos) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("--------MENU ADMINISTRACION--------");
			System.out.println("Introducir productos");
			System.out.println("Mostrar productos");
			System.out.println("Eleminar productos");
			System.out.println("Volver al menu principal");
			System.out.print("     Opcion: ");
			num=entrada.nextInt();
		}while(num!=4);
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
				System.out.println("Saliend...");
				break;
			}
		}while(num !=3);
	}
	
	public static void main(String[] args) {
		ArrayList<Producto> lProductos = new ArrayList<>();
	}

}
