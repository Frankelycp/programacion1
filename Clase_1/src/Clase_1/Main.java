package Clase_1;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char caracter = 'a';
        float importe = 5.5f;
        String nombre  = "juan";
        byte edad = 13;

        // para quedarse con un carcter se tiene que indicar .charAt(1);
        // para tabular \t y para saltear la linea es \n
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Base");
        int base = sc.nextInt(); // Lee la entrada como un número entero

        System.out.println("Ingrese Altura");
        int altura = sc.nextInt(); // Lee la entrada como un número entero

        if (base > altura){

            System.out.println("La base es mayor a la Altura" + base);
        }

        System.out.println("La base por altura es = " + base*altura);

    }
}