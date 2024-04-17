package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Construir un programa que solicite desde teclado un número de
//mes y posteriormente notifique por pantalla la cantidad de días de
//ese mes. En el caso de que ingrese 2 como número de mes
//(febrero) deberá además solicitar ingresar un número de año y,
//dependiendo si es bisiesto o no con la siguiente sentencia:
//((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
//imprimir la cantidad de días correspondiente.
public class Ejercicio_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         int mes = 0;
         int anio = 0;
         int dia = 0;

        try {
            System.out.println("Ingrese Mes");
            mes = Integer.parseInt(entrada.readLine());

            System.out.println("Ingrese Año");
            anio = Integer.parseInt(entrada.readLine());

            if (mes == 2){
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                     dia = 28;
                    }
                else {
                    dia  = 29;
                }
                }

            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dia = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dia = 30;
                    break;
            }

            if (mes < 1 || mes > 12 ){
                System.out.println("ingreso un numero de mes Invalido");
            }
            else {
                System.out.printf("EL MES  " + mes + " TIENE " + dia + " Dias");
            }
            }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}