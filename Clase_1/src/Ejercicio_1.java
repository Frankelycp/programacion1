import inputReader.InputReader;

import java.util.Scanner;

public class Ejercicio_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese Valor entero");
            int valorEntero = InputReader.nextInt();
            System.out.println("el valor ingresado es un INT " + valorEntero);

            System.out.println("Ingrese Valor Double");
            double valorDouble = InputReader.nextDouble();
            System.out.println("el valor ingresado es un Double " + valorDouble);

            System.out.println("Ingrese Valor char");
            char valorChar = InputReader.nextChar();
            System.out.println("el valor ingresado es un char " + valorChar);

            System.out.println("Ingrese Valor Booleano");
            boolean valorBoleano = sc.nextBoolean();
            System.out.println("el valor ingresado es un Booleano " + valorBoleano);
        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}