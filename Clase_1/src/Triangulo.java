import inputReader.InputReader;
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;

        try {
            System.out.println("Ingrese el Valor del primero lado del triangulo");
            lado1 = InputReader.nextInt();
            System.out.println("Ingrese el Valor del segundo lado del triangulo");
            lado2 = InputReader.nextInt();
            System.out.println("Ingrese el Valor del tercero lado del triangulo");
             lado3 = InputReader.nextInt();
            Boolean triangulo = ((lado1 + lado2 > lado3) && lado1 > 0 && (lado2 + lado3 > lado1) && lado2>0 && (lado1 + lado3 > lado2) && lado3 > 0);
            System.out.println("Es un Triangulo " + triangulo);

        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}