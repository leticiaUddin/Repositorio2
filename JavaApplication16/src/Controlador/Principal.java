package Controlador;

import Vista.Consola;

/**
 *
 * @author REDMA
 */
public class Principal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Operaciones o = new Operaciones();
        Consola c = new Consola();
        

        int opcion;
        do {
            opcion = c.menu();
            switch (opcion) {
                case 1:
                    System.out.println("SUMA");
                    float a = c.pideNumero("Introduzca un sumando: ");
                    float b = c.pideNumero("Introduzca otro sumando: ");
                    c.muestraResultado("El resultado de la suma es: ", o.suma(a, b));
                    break;

                case 2:
                    System.out.println("Resta");
                    a = c.pideNumero("Introduzca un numero: ");
                    b = c.pideNumero("Introduzca otro numero: ");
                    c.muestraResultado("El resultado de la resta es: ", o.resta(a, b));
                    break;

                case 3:
                    System.out.println("División");
                    a = c.pideNumero("Introduzca un numero: ");
                    b = c.pideNumero("Introduzca otro numero: ");
                    c.muestraResultado("El resultado de la raiz es: ", o.division(a, b));
                    break;
                    
                case 4:
                    System.out.println("Multiplicacion");
                    a = c.pideNumero("Introduzca un numero: ");
                    b = c.pideNumero("Introduzca otro numero: ");
                    c.muestraResultado("El resultado de la raiz es: ", o.multiplicacion(a, b));
                    break;
            }

        } while (opcion != 0);
    }
}
