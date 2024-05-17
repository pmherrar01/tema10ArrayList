import java.util.Scanner;

public class Venta {

	private String nombreMes;
	private int ventas;

	public Venta() {
		this.nombreMes = "";
		this.ventas = 0;
	}

	public Venta(String nombreMes, int ventas) {
		this.nombreMes = nombreMes;
		this.ventas = ventas;
	}

	public String getNombreMes() {
		return nombreMes;
	}

	public void setNombreMes(String nombreMes) {
		this.nombreMes = nombreMes;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public Venta introducirDatos() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Nombre: ");
		nombreMes = entrada.nextLine();
		System.out.println("Ventas: ");
		ventas = entrada.nextInt();
		
		Venta venta = new Venta(nombreMes,ventas);
		
		return venta;
	}

	@Override
	public String toString() {
		return "Venta [nombreMes=" + nombreMes + ", ventas=" + ventas + "]";
	}



}
