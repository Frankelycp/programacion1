import inputReader.InputReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio2_bonusTrack {
    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char diaIngresado;
        double importeTotal;
//        En Carrefive, los días martes y jueves hay “PROMO”. En los días
//        martes, si el importe total de la compra supera los $13.000 el
//        descuento es del 5%, pero si supera los $20.000 es del 7.5%. Los
//        jueves, en cambio, el descuento es para todos los tickets cuyo
//        importe supere los $25.000 y será el 10% con un tope de reintegro
//        de $3.000 por ticket. Escribir un programa que dado el día de la
//        semana que se hace la compra y el importe del ticket, verifique si
//        aplica hacer el descuento o no. Puede suponer un dato numérico
//        para cada día, ejemplo: 1 para el martes y 2 para el jueves.

        boolean desc;
        System.out.println("Ingrese el numero del dia Teniendo en cuenta\nLunes = 1\nMartes = 2" +
                "\nMercoles = 3\nJueves =4 \nViernes = 5\nSabado = 6" +
                "\nDomingo = 7");
        System.out.println("Ingrese el dia de la Semana");
        diaIngresado = entrada.readLine().charAt(0);
        System.out.println("Ingrese el importe Total de la compra");
        importeTotal = Double.valueOf(entrada.readLine());

        desc = (diaIngresado == 2 && importeTotal >= 13000) || (diaIngresado == 4 && importeTotal > 25000);

        System.out.println("Se realiza el descuento ? " + desc);




    }
}