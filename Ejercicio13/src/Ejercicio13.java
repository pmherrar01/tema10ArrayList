import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio13 {

	final static int MESES = 12;

	public static void rellenarDatos(ArrayList<Venta> lista) {
		int i;
		Venta venta = new Venta();
		for(i = 0; i < MESES;i++) {
			lista.add(venta.introducirDatos());
		}
	}

	public static void mostrarMeses(ArrayList<Venta> lista) {
		int i;
		for (i = 0; i < lista.size();i++) {
			System.out.println("Mes " + (i+1) + " " + lista.get(i).getNombreMes() + "\n" + "Vestas: " + lista.get(i).getVentas());
		}
	}

	public static void mostrarVentasTotales(ArrayList<Venta> lista) {
		int i, suma=0;
		for(i = 0; i < lista.size();i++) {
			suma = suma + lista.get(i).getVentas();
		}
		System.out.println("Ventas totales: " + suma + " ventas");
	}

	public static void mesMasVentas(ArrayList<Venta> lista) {
		int mesMasVentas=0, i;

		for(i = 0; i<lista.size(); i++) {
			if (lista.get(i).getVentas() > mesMasVentas) {
				mesMasVentas = lista.get(i).getVentas();
			}
		}

		for (i = 0; i < lista.size();i++) {
			if(mesMasVentas == lista.get(i).getVentas()) {
				System.out.println("Mes con mas ventas: " + lista.get(i).getNombreMes());
			}
		}
	}

	public static void mostrarMesesA(ArrayList<Venta> lista) {
		int i, suma=0;
		for(i=0;i<lista.size();i++) {
			if(lista.get(i).getNombreMes().charAt(0) == 'A') {
				suma = suma + lista.get(i).getVentas();

			}
		}
		System.out.print("Ventas totales de meses que empiezan por A: " + suma);
	}

	public static void menu(ArrayList<Venta> lista) {

		Scanner entrada = new Scanner(System.in);
		int num;
		do {
			System.out.println("Introducir ventas del año");
			System.out.println("Mostrar ventas");
			System.out.println("Mostrar suma total de ventas");
			System.out.println("Mostrar ventas totales de los meses que empiezan por A");
			System.out.println("Mostrar el mes con mas ventas");
			System.out.println("Salir");
			System.out.print("Opcion: ");
			num = entrada.nextInt();

			switch(num) {
			case 1:
				System.out.println("Introduciendo ventas...");
				rellenarDatos(lista);
				break;
			case 2:
				System.out.println("Mostrando ventas...");
				mostrarMeses(lista);
				break;
			case 3:
				System.out.println("Mostrande ventas totales...");
				mostrarVentasTotales(lista);
				break;
			case 4:
				mostrarMesesA(lista);
				System.out.println("Mostrando ventas de los meses que emoiezan por 'A'");
				break;
			case 5:
				System.out.println("Mostrando mes con mas ventas...");
				mesMasVentas(lista);
				break;
			case 6: 
				System.out.println("Saliendo...");
				break;
			}
		}while(num!=6);
	}

	public static void main(String[] args) {
		ArrayList<Venta> lista = new ArrayList<>();
		menu(lista);
	}

}
