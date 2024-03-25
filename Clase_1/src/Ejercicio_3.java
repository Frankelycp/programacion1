
import inputReader.InputReader;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

//        Escribir un programa que declare una constante de tipo int y pida el
//        ingreso de un valor por teclado. Luego muestre el valor ingresado.
//         ¿Qué pasa en este caso? ¿Se puede o surge algún problema?

        Scanner sc = new Scanner(System.in);

        final int n;
        System.out.println("Ingrese un valor por teclado");
        String valorIngresoPorTeclado = InputReader.nextLine();
        System.out.println(valorIngresoPorTeclado);
    }
}