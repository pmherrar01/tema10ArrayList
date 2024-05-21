import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio14 {

	public static void introducirDatos(ArrayList<Alumno> lista) {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		String respuesta, nombre;
		Alumno alumnoNuevo;
		do {
			System.out.println("Nombre del Alumno: ");
			nombre = entrada1.nextLine();
			alumnoNuevo = new Alumno(nombre);
            alumnoNuevo.rellenarAsignatura();
            lista.add(alumnoNuevo);
			System.out.println("¿Quieres introducir otro alumno?");
			respuesta=entrada.nextLine();	
		}while(respuesta.equalsIgnoreCase("si"));
	}
	
	public static void mostrarALumno(ArrayList<Alumno> lista) {
		int i;
		for(i=0;i<lista.size();i++) {
			lista.get(i).mostrarAlumno();
		}
	}
	
	public static void mejorAlumno(ArrayList<Alumno> lista){
        int i, mejorAlumno = 0;
        float mayor = lista.get(0).getTotalNotas();
        float suma = 0;
        for(i = 0;i < lista.size();i++){
            suma = lista.get(i).getTotalNotas();
            if  (suma > mayor){
                mayor = suma;
                mejorAlumno = i;
            }
        }
        System.out.println("EL mejor alumno es "+lista.get(mejorAlumno).getNombreAlumno());
    }
	
	public static void asignaturaMasDificil(ArrayList<Alumno> lista) {
		String[] vNombresAsignaturas = {"Lengua", "Mates", "Fisica"};
		int maxSuspensos = 0;
		String asignaturaDificil = "";
		
		for(String nombreAsignatura : vNombresAsignaturas) {
			int suspensos = 0;
			for (Alumno alumno : lista) {
				suspensos += alumno.asignaturaDificil();
			}
			if(suspensos > maxSuspensos) {
				maxSuspensos = suspensos;
				asignaturaDificil = nombreAsignatura;
			}
		}
		System.out.println("La asignatura mas dificil es:" + asignaturaDificil);
	}
	
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
				introducirDatos(lista);
					break;	
			case 2:
				mostrarALumno(lista);
				break;
			case 3:
				mejorAlumno(lista);
				System.out.println();
				break;
			case 4:
				asignaturaMasDificil(lista);
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
