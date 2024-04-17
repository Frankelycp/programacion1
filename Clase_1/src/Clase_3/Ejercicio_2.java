
package Clase_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_2 {
    public static void main(String[] args) throws IOException {
        char entrada = ingresarCaracter();
        int n = ingresarentero();
        int m = ingresarentero();
        operacion(entrada, n, m);
    }

    public static char ingresarCaracter() {
        char caracter = ' ';
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (caracter != 'a' && caracter != 'b') {
            try {
                System.out.println("Ingrese una opcion a o b: ");
                caracter = entrada.readLine().charAt(0);

            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
        return caracter;
    }
    public static int ingresarentero() {
        //duplicate code fragment line 10
        int entero = 11;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (entero > 10) {
            try {
                System.out.println("Ingrese Valor entero menor que 10 ");
                entero = Integer.valueOf(entrada.readLine());
            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
        return entero;
    }

    public static void operacion(char caracter, int n, int m) {
        if (caracter == 'a') {
            System.out.println("la suma de n = " + n + " y m = " + m + " = " + (n + m));
        } else {
            System.out.println("la resta de n = " + n + " y m = " + m + " = " + (n - m));
        }
    }
}





