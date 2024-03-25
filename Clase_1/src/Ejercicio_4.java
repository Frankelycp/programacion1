import inputReader.InputReader;

import java.util.Scanner;

public class Ejercicio_4 {

//    Escribir un programa que permita ingresar 5 números de a uno por
//    vez y que los muestre por pantalla en orden inverso:
//    Ejemplo: Ingreso: 23, 4, 2, 100, 3
//    Se debe mostrar: 3, 100, 2, 4, 23
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números uno por uno:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = InputReader.nextInt();
        }

        System.out.println("\nNúmeros en orden inverso:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}