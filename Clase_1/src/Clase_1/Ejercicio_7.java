package Clase_1;

import inputReader.InputReader;

public class Ejercicio_7 {
    public static void main(String[] args) {

//        Escribir un programa que imprima por pantalla la tabla de verdad
//        para los operadores lógicos or y and (por separado) para dos
//        valores booleanos. Utilizar los operadores para calcular el
//        resultado. Por ejemplo, imprimir el siguiente caso para el operador
//        or:
//        false or true es: true



        boolean[] valores = {false, true};
        int longitud = 2;

        System.out.println("Tabla de verdad para el operador OR:");
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                boolean valor1 = valores[i];
                boolean valor2 = valores[j];
                boolean resultado = valor1 || valor2;
                System.out.println(valor1 + " or " + valor2 + " es: " + resultado);
            }
        }

        System.out.println("\nTabla de verdad para el operador AND:");
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                boolean valor1 = valores[i];
                boolean valor2 = valores[j];
                boolean resultado = valor1 && valor2;
                System.out.println(valor1 + " and " + valor2 + " es: " + resultado);
            }
        }
    }
}