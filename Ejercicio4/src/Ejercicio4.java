import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio4 {

	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero entero: ");
		num=entrada.nextInt();
		return num;
	}

	public static void rellenarLista(ArrayList<Integer> lista1,ArrayList<Integer> lista2) {
		Scanner entrada = new Scanner(System.in);
		int num = pedirNumero();
		while(num>0){
			lista1.add(num);
			lista2.add(num);
			num=pedirNumero();
		}

	}

	public static void cambiarDuplicados(ArrayList<Integer> lista2, int num) {
		int i;
		for(i = 0; i< lista2.size(); i++) {
			if(lista2.get(i)==num) {
				lista2.set(i, 0);
			}

		}
	}

	public static void mostrarListas(ArrayList<Integer> lista1,ArrayList<Integer> lista2) {
		int i;
		for(i = 0; i < lista1.size();i++) {
			System.out.print(lista1.get(i));
		}
		System.out.print(" ---> ");
		for(i = 0; i < lista2.size();i++) {
			System.out.print(lista2.get(i));
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();
		int num=pedirNumero();
		rellenarLista(lista1,lista2);
		cambiarDuplicados(lista2,num);
		mostrarListas(lista1,lista2);
	}

}
