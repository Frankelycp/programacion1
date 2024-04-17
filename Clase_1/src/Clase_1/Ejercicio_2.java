
package Clase_1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_2 {
    public static void main(String[] args) throws IOException {
        char entrada = ingresarCaracter();
        operacion(entrada);

    }
    public static char ingresarCaracter() {
        char caracter;
        caracter = ' ';
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        return caracter;
    }
    public static void operacion(char caracter) {
        int n = 56;
        int m = 50;
        if (caracter == 'a') {
            int resultado = n+m;
            System.out.println("la suma de n = " + n + " y m = " + m + " = " + resultado);
        }
        else if (caracter == 'b') {
            int resultado = n-m;
            System.out.println("la resta de n = " + n + " y m = " + m + " = " + resultado);
        }
        else {
            System.out.println("el caracter ingresado " + caracter +  " no es a ni b");
        }
    }
}





