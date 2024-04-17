package Clase_2;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//a. solicite un número e indique si es positivo o negativo.
public class Ejercicio_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int numero = 0;
        try {
            System.out.println("Ingrese Numero");
            numero = Integer.valueOf(entrada.readLine());
            if (numero>0)
            {
                System.out.println("el numero " + numero + " es postivo");
            }
            else if (numero<0){
                System.out.println("el numero " + numero + " es negativo");
            }
            else
                System.out.printf("el numero es 0");
        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}