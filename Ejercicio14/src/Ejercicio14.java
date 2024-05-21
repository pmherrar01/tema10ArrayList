import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio14 {

	public static void menu(ArrayList<Alumno> lista) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		int num;
		String respuesta;
		do {
			System.out.println("1- Introducir un nuevo alumno: ");
			System.out.println("2- MOstrar alumnos introducidos hasta el momento");
			System.out.println("3- Mejor alumno de la clase");
			System.out.println("4- Asignatura mas dificil");
			System.out.println("5- Salir del programa");
			System.out.print("Opcion: ");
			num=entrada.nextInt();
			
			switch (num){
			case 1:
				do {
					
					System.out.println("¿Quieres introducir otro alumno?");
					respuesta=entrada.nextLine();
					break;	
				}while(respuesta.equalsIgnoreCase("si"));
			case 2:
				System.out.println();
				break;
			case 3:
				System.out.println();
				break;
			case 4:
				System.out.println();
				break;
			case 5:
				System.out.println();
				break;
			}
			
		}while(num!=5);
	}
	
	public static void main(String[] args) {

		ArrayList<Alumno> lista = new ArrayList<>();
		menu(lista);
	}

}
