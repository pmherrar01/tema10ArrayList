import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio9 {

	final static String VNOMBRESDIAS[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	final static int POSICIONES = 31;

	public static void rellenarTemperaturas(ArrayList<Dia> lista) {
		int temperatura;
		Dia dia;

		int diaSemana = (int) (Math.random() * 7);
		for(int i = 0;i < POSICIONES;i++){
			temperatura = (int) (Math.random() * 71) - 20;
			dia = new Dia(VNOMBRESDIAS[diaSemana], temperatura);
			lista.add(dia);
			if  (diaSemana == 6){
				diaSemana = 0;
			}
			else{
				diaSemana++;
			}
		}
	}

	public static void mostrarTemperaturas(ArrayList<Dia> lista) {
		int i;
		for(i = 0; i < lista.size();i++) {
			System.out.println(lista.get(i).getNombreDia() + " día " + (i+1) + " " + lista.get(i).getTemperatura() + " grados");
		}
	}

	public static void calcularMedia(ArrayList<Dia> lista) {
		int i, suma=0;
		for(i = 0; i < lista.size();i++) {
			suma = suma + lista.get(i).getTemperatura();
		}

		System.out.println("La temperatura media del mmes es: " + suma/(lista.size()) + " grados");
	}

	public static void diasCalurosos(ArrayList<Dia> lista) {
		int i, diaCaluroso = 0 ;
		for(i = 0; i < lista.size();i++) {
			if(lista.get(i).getTemperatura() > diaCaluroso) {
				diaCaluroso = lista.get(i).getTemperatura();
			}
		}
		
		for(i = 0; i < lista.size(); i++) {
			if(lista.get(i).getTemperatura()==diaCaluroso) {
				System.out.println("El " + lista.get(i).getNombreDia() + " dia " + (i+1) + " con " + diaCaluroso + " grados");
			}
		}
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
				rellenarTemperaturas(lista);
				break;
			case 2:
				System.out.println("Mostrando...");
				mostrarTemperaturas(lista);
				break;
			case 3:
				System.out.println("Calculando temperatura media...");
				calcularMedia(lista);
				break;
			case 4: 
				System.out.println("Buscando dias mas calurosos...");
				diasCalurosos(lista);
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=5);
	}

	public static void main(String[] args) {
		ArrayList<Dia> lista = new ArrayList<>();
		menu(lista);
	}

}
