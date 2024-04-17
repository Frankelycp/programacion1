package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//. Escribir un programa donde el usuario ingrese un número entre 0
//y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
//tiene 3 dígitos debe informar qué número es.

public class Practica_2_Bonus_1{

    public static void main(String[] args) throws IOException {
        char caracter;
        BufferedReader entrada = new BufferedReader(new
                InputStreamReader(System.in));
        try{
            System.out.println("Ingrese un caracter :");
            caracter = entrada.readLine().charAt(0);
            if (('a'<=caracter)||(caracter<='z')) {
                System.out.println("Es carácter minúscula");
            }
            if (('A'<=caracter)&&(caracter<='Z')) {
                System.out.println("Es carácter mayúscula");
            }
            else {
                System.out.println("No es caracter letra");
            }
        }
        catch (Exception exc){
            System.out.println(exc);
        }
    }
}




