import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void pedirYRellenarNumeros(ArrayList<Integer> lista) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introduce numeros hasta que introduzcas un numero negativo");
			num=entrada.nextInt();
			if(num>0) {
				lista.add(num);
			}
		}while(num>0);
	}	
	
	public static void mostrarLista(ArrayList<Integer> lista) {
		for(int i = 0;i<lista.size();i++) {
			System.out.print("-- " + lista.get(i)+ " --");
		}
		System.out.println("\n");
	}
	
	public static void mayorDeLaLista(ArrayList<Integer> lista) {
		int i, num, mayor=lista.get(0);
		for(i = 0; i < lista.size();i++) {
			num = lista.get(i);
			if(num>mayor) {
				mayor = num;
			}
		}
		System.out.println("El nuumero mayor es el: " + mayor);
	}
	
	public static void menorDeLaLista(ArrayList<Integer> lista) {
		int i, num, menor=lista.get(0);
		for(i = 0; i < lista.size();i++) {
			num = lista.get(i);
			if(num<menor) {
				menor = num;
			}
		}
		System.out.println("El nuumero menor es el: " + menor);
	}
	
	public static void sumaDeLaLista(ArrayList<Integer> lista) {
		int suma=0;
		for(int valor : lista) {
			suma = suma + valor;
		}
		System.out.println("La suma de los numeros es: " + suma);
	}
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(); 
		pedirYRellenarNumeros(lista);
		mostrarLista(lista);
		mayorDeLaLista(lista);
		menorDeLaLista(lista);
		sumaDeLaLista(lista);
	}

}
