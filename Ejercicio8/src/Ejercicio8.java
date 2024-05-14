import java.util.Scanner;
import java.util.ArrayList;


public class Ejercicio8 {

	public static void rellenarLista(ArrayList<Alumno> lista) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		String respuesta, nombre;
		int curso;
		Alumno alumno;
		System.out.println("Deseas introducir un alumno?(si/no)");
		respuesta = entrada.nextLine();
		while(respuesta.equalsIgnoreCase("si")){
			System.out.println("Nomber del alumno: ");
			nombre = entrada.nextLine();
			System.out.println("Curso del alumno: ");
			curso=entrada1.nextInt();
			alumno = new Alumno(nombre, curso);
			lista.add(alumno);
			System.out.println("Deseas introducir otro alumno?(si/no)");
			respuesta = entrada.nextLine();
		}
	}

	public static void mostrarLista(ArrayList<Alumno> lista) {
		int i;
		for(i = 0; i < lista.size();i++) {
			System.out.println("Alumno " + (i+1) + "\n" + lista.get(i).toString());
		}
	}

	public static void main(String[] args) {
		ArrayList<Alumno> lista = new ArrayList<>();		
		rellenarLista(lista);
		mostrarLista(lista);
	}

}
