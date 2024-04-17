package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Escribir un programa que solicite el ingreso de un número mayor a
//50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
public class Ejercicio_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int num = 0;
         int limite = 50;

        try {
            System.out.println("Ingrese numero mayor a 50");
            num = Integer.parseInt(entrada.readLine());

            if (num > limite)
            {
                if (num%2 == 0 || num%3==0){
                    System.out.printf("El numero ingresado es multiplo de dos o tres");
                }
                else {
                    System.out.printf("el numero no es multiplo de dos ni tres");
                }
            }
            else System.out.printf("Ingreso un numero menor a " + limite);
            }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}