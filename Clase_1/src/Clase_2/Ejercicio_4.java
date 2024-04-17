package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//c. solicite un número del 1 al 7 e imprima el día de la semana.
public class Ejercicio_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int dia = 0;
         String diaString = "";
        try {
            System.out.println("Ingrese un dia de la semana\n" +
                    "Lunes = 1 \n" +
                    "Martes = 2\n"
                    +
                    "Miercoles = 3\n"
                    +
                    "Jueves = 4\n"
                    +
                    "Viernes =5\n"
                    +
                    "Sabado = 6\n"
                    +
                    "Domingo = 7\n");
            dia = Integer.valueOf(entrada.readLine());

            switch (dia){
                case 1 : diaString = "Lunes"; break;
                case 2 : diaString = "Martes"; break;
                case 3 : diaString = "Miercoles"; break;
                case 4 : diaString = "Jueves"; break;
                case 5 : diaString = "Viernes"; break;
                case 6 : diaString = "Sabado"; break;
                case 7 : diaString = "Domingo"; break;
                default:
                    System.out.println("Debe ingresar un numerO del 1 al 7 para los dias de la semana");
            }
            System.out.printf("el dia de la Semana es " + diaString);
        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}