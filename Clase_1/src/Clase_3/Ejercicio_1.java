
package Clase_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ESTO FUE UN CAMBIO HECHO PARA PROBAR.

public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {
        char numero = obtenerChar();
        determinaTipoCaracter(numero);

    }

    public static char  obtenerChar() {
         char caracter = ' ';
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.readLine().charAt(0);
        } catch (Exception exc) {
            System.out.println("Error");
        }
        return caracter;
    }

    public static void determinaTipoCaracter(char caracter) {
        if (caracter >= '0' && caracter <= '9') {
            System.out.println("El caracter ingresado es un digito. " + caracter);
        }
        else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("El caracter ingresado es una vocal. " + caracter);
        }
        else if (caracter >= 'a' && caracter <= 'z'){
            System.out.println("El caracter ingresado es una consonante. " + caracter);
        }
        else {
            System.out.println("El Caracter no es una vocal ni consonante ni digito. " + caracter);
        }
    }
}





