package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//. Escribir un programa donde el usuario ingrese un número entre 0
//y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
//tiene 3 dígitos debe informar qué número es.

public class Ejercicio_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int num = 0;
         int limiteMenor = 0;
         int limiteMayor = 999;

        try {
            System.out.println("Ingrese numero entre " + limiteMenor + " y " + limiteMayor);
            num = Integer.parseInt(entrada.readLine());
            if (num >= limiteMenor && num <= limiteMayor) {
                int cantidadDigitos = String.valueOf(num).length();

                System.out.println("El número ingresado tiene " + cantidadDigitos + " dígitos.");
                if (cantidadDigitos == 3) {
                    System.out.println("El número ingresado es: " + num);
                }
            } else {
                System.out.println("El número ingresado está fuera del rango permitido.");
            }
        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}



