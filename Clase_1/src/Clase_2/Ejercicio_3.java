package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//b. solicite un número e imprima “grande” si es mayor a 100 y
//“chico “ si es menor
public class Ejercicio_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int numero = 0;
         final  int limite = 100;
        try {
            System.out.println("Ingrese Numero");
            numero = Integer.valueOf(entrada.readLine());
            if (numero>limite)
            {
                System.out.println("el numero " + numero + " es mayor a " + limite);
            }
            else if (numero==limite){
                System.out.println("el numero " + numero + " es igual al limite " + limite);
            }
            else
                System.out.printf("es un numer chico");
        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}