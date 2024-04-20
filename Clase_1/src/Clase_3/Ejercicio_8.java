
package Clase_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;


//Escribir un programa que mientras el usuario cargue desde
//teclado un número entero distinto de 0, imprima por pantalla la
//suma que se obtiene de invocar un método que calcula la
//sumatoria de los primeros 200 números naturales (son números
//enteros entre 1 y 200).
public class Ejercicio_8 {
    public static void main(String[] args) throws IOException {
        int n = ingresarentero();
    }

    public static int ingresarentero() {
        //duplicate code fragment line 10
        int entero = 1;
        boolean condicion = true;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (entero != 0) {
            try {
                System.out.println("Ingrese un un numero entero mayor que 0 ");
                entero = Integer.valueOf(entrada.readLine());
                operacion();

            } catch (Exception exc) {
                System.out.println("Error");
            }
        }
        return entero;
    }
//}

    public static void operacion() {
        int suma = 0;
        int i=1;
        while (i >= 1 && i <= 200)
        for (;i<=200;i++)
            suma +=i;
        {
            System.out.println("la sumatoria de los primeros 200 numeros naturales de"  + suma);
        }

    }
}





