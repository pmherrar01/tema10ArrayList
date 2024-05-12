import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {

	public static String pedirNombre() {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		System.out.println("Introduce el nombre: ");
		nombre = entrada.nextLine();
		return nombre;
	}

	public static String pedirSeguir() {
		Scanner entrada = new Scanner(System.in);	
		String seguir;
		System.out.println("¿Deseas seguir introduciendo nombres? (si/no)");
		seguir = entrada.nextLine();
		return seguir;
	}
	
	public static void rellenarLista(ArrayList<String> lista) {
		Scanner entrada = new Scanner(System.in);
		String nombre,  seguir;
		do {
			nombre=pedirNombre();
			lista.add(nombre);
			seguir=pedirSeguir();
		}while(seguir.equalsIgnoreCase("si"));
	}
	
	public static void mostrarLista(ArrayList<String> lista) {
		for(int i = 0; i<lista.size();i++) {
			System.out.println("-- " + lista.get(i)+" --" );
		}
	}

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList <String>();
		rellenarLista(lista);
		mostrarLista(lista);

	}

}
