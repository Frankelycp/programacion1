package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int hora,min = 0;
        int horaCierre = 18;
        int minutoCierre = 60;
        int horaRestante = 0;
        int minRestante = 0;
        try {
            System.out.println("Ingrese Horas");
            hora = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese Minutos");
            min = Integer.valueOf(entrada.readLine());

            horaRestante = horaCierre - hora;
            minRestante = minutoCierre - min;

            if (((hora > 8 && hora <= 18) && (min <= 59)) || (hora == 8 && min >=30))
            {
                System.out.println("El Comercio se encuentra Abierto quedan " + horaRestante + " Hora " + minRestante  + " Minutos para cerrar");
            }
            else {

                System.out.println("el Comercio se encuentra Cerrado");
            }

        }
        catch (Exception exc ) {
            System.out.println(exc);
        }
    }
}