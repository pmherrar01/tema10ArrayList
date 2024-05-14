import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio9 {

	final static String VNOMBRESDIAS[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	
	public static void rellenarTemperaturas(ArrayList<Dia> lista) {
		
	}
	
	public static void menu(ArrayList<Dia> lista) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1- Rellenar las temperaturas de manera aleatoria");
			System.out.println("2- Mostrar las temperaturas");
			System.out.println("3- Temperatura media");
			System.out.println("4- Dia o dias mas calurosos");
			System.out.println("5- Salir");
			System.out.print("Opcion: ");
			num=entrada.nextInt();
			
			switch(num){
			case 1:
				System.out.println("Rellenadno...");
				break;
			case 2:
				System.out.println("Mostrando...");
				break;
			case 3:
				System.out.println("Calculando temperatura media...");
				break;
			case 4: 
				System.out.println("Buscando dias mas calurosos...");
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=6);
	}
	
	public static void main(String[] args) {
		ArrayList<Dia> lista = new ArrayList<>();

	}

}
