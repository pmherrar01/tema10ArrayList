import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio13 {

	public static void menu(ArrayList<Venta> lista) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.print("Opcion: ");
			num = entrada.nextInt();
		}while(num!=6);
	}
	
	public static void main(String[] args) {
		ArrayList<Venta> lista = new ArrayList<>();

	}

}
