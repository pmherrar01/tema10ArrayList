import java.util.Scanner;

public class Producto {

	private String nombreProducto;
	private float precio;
	private int stock;
	
	public Producto() {
		this.nombreProducto = "";
		this.precio = 0;
		this.stock = 0;
	}
	
	public Producto(String nombreProducto, float precio, int stock) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Producto introducirDatos() {
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Nombre del producto: ");
		this.nombreProducto=entrada.nextLine();
		System.out.println("Precio: ");
		this.precio=entrada1.nextFloat();
		System.out.println("Strock: ");
		this.stock=entrada2.nextInt();
		
		Producto producto = new Producto(this.nombreProducto,this.precio,this.stock);
		
		return producto;
	}
	
	
	
}
