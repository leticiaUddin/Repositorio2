package Vista;

import java.util.Scanner;

/**
 *
 * @author REDMA
 */
public class Consola {
    public float pideNumero(String pregunta){
        Scanner teclado = new Scanner(System.in);
        System.out.print(pregunta);
        float devuelveNumero = teclado.nextFloat();
        
        return devuelveNumero;
    }
  
    public void muestraResultado(String texto, float resultado){
        System.out.println(texto + resultado);
    }
    public int menu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\tCALCULADORA SIMPLE ");
        System.out.println("\t******************");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Divisi�n.");
        System.out.println("4. Multiplicaci�n.");
        System.out.print("Introduzca una opcion: ");
        int opcion = teclado.nextInt();
        return opcion;
    }
}