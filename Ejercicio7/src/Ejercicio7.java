import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
	
    final static int NUMSEMANAS = 4; 
    final static int NUMDIASSEMANA = 7;
    final static String VNOMBRES[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

	public static void rellenarTemperaturas(ArrayList<ArrayList<Integer>> lista) {
		Scanner entrada = new Scanner(System.in);
		int i,j, temperatura;
		for(i=0; i<NUMSEMANAS;i++) {
			lista.add(new ArrayList<Integer>());
			for(j=0;j<NUMDIASSEMANA;j++) {
				System.out.println("Temperatura " + VNOMBRES[j] + " semana " + (i+1) + ": " );
				temperatura = entrada.nextInt();
				lista.get(i).add(temperatura);
			}
		}
		
	}
	
	public static void mostrarTemperaturas(ArrayList<ArrayList<Integer>> lista) {
		int i, j;
		for(i = 0; i < NUMSEMANAS;i++) {
			System.out.println("Semana" + (i+1));
			for(j=0; j < NUMDIASSEMANA; j++) {
				System.out.println(VNOMBRES[j] + ": " + lista.get(i).get(j)+ " grados");
			}
			System.out.println("------------");
		}
	}
	
	public static void calcularMedia(ArrayList<ArrayList<Integer>> lista) {
		int i,j,suma=0;
		for(i = 0; i<NUMSEMANAS; i++) {
			for(j = 0; j<NUMDIASSEMANA; j++) {
				suma = suma + lista.get(i).get(j); 
			}
		}
		 System.out.println("La temperatura media del mes es: " + (suma/(NUMSEMANAS*NUMDIASSEMANA)));
	}
	
	public static void diaMasCaluroso(ArrayList<ArrayList<Integer>> lista) {
		int i,j,diaCaluroso=lista.get(0).get(0);
		for(i = 0; i < NUMSEMANAS; i++) {
			for(j = 0; j < NUMDIASSEMANA;j++) {
				if(lista.get(i).get(j)>diaCaluroso) {
					diaCaluroso=lista.get(i).get(j);
				}
			}
		}
		System.out.println("El dia mas caluroso son: ");
		for(i = 0; i < NUMSEMANAS; i++) {
			for(j = 0; j < NUMDIASSEMANA;j++) {
				if(lista.get(i).get(j)==diaCaluroso) {
					System.out.println("El " + VNOMBRES[j] + " de la semana " + (i+1) + " con " + diaCaluroso + " grados");
				}
			}
		}
	}	
	
	public static void menu(ArrayList<ArrayList<Integer>> lista) {
		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("---------MENU---------");
			System.out.println("1- Rellenar temperaturas");
			System.out.println("2- Mostrar TEmperaturas");
			System.out.println("3- Visualizar temperatura media del mes");
			System.out.println("4- Dia o dias mas calurosos");
			System.out.println("5- Salir");
			System.out.print("Opcion: ");
			num=entrada.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("Rellenado temperatura...");
				rellenarTemperaturas(lista);
				break;
			case 2:
				System.out.println("Mostrando tempertura...");
				mostrarTemperaturas(lista);
				break;
			case 3:
				System.out.println("Calculando temperatura media...");
				 calcularMedia(lista);
				break;
			case 4:
				System.out.println("Buscando dia mas caluroso...");
				diaMasCaluroso(lista);
				break;
			case 5: 
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=5);
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lista = new ArrayList<>();
		menu(lista);
	}

}
