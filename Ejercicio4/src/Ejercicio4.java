import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Entero: ");
        num = teclado.nextInt();
        return num;
    }
    
    public static void rellenarLista(ArrayList<Integer> lista){
        int num;
        num = pedirNumero();
        while(num > 0){
            lista.add(num);
            num = pedirNumero();
        }
    }
    
    public static void sustituirRepetidosPorCero(ArrayList<Integer> lista, int num){
        int primero, ultimo, i;  
        
        primero = lista.indexOf(num);
        ultimo = lista.lastIndexOf(num);
        for(i = primero;i <= ultimo;i++){  
            if  (lista.get(i) == num){
                lista.set(i, 0);
            }
        }
    }
    
    public static boolean esRepetido(ArrayList<Integer> lista, int num){
        int posIni = lista.indexOf(num);
        int posFin = lista.lastIndexOf(num);
        
        if  (posIni == posFin){
            return false;
        }
        else{
            return true;
        }
    }
    
    public static void recorrerLista(ArrayList<Integer> lista){
        int num;
        for(int i = 0;i < lista.size();i++){
            num = lista.get(i);
            if  (num != 0){
                if  (esRepetido(lista, num)){  
                    sustituirRepetidosPorCero(lista, num);
                }
            }
        }
    }

    public static void mostrarLista(ArrayList<Integer> lista){
        for(int i = 0; i < lista.size();i++){
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.print("\n");
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList <Integer>();
        rellenarLista(lista);
        mostrarLista(lista);
        recorrerLista(lista);
        mostrarLista(lista);
    }
    
}
