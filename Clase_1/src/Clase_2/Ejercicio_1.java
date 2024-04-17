package Clase_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int hora,min = 0,horaApertura = 8 ,minApertura = 30,horaCierre = 19,minutoCierre = 60;
        //  ESTAS 2 VARIABLES SON PARA VERIFICAR QUE LAS HORAS FALTANTES PARA CERRAR SEAN LAS CORRECTAS.
        int horaRestante = 0;
        int minRestante = 0;
        try {
            System.out.println("Ingrese Horas");
            hora = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese Minutos");
            min = Integer.valueOf(entrada.readLine());
            //ACA HAGO EL CALCULO PARA SABER LA HORA Y MINUTOS DE CIERRE RESTANDLE 1 HORA A LA HORA DE CIERRE PORQUE
            // AL SUMARLE TENER LOS MINUTOS LA HORA NO ES NECESARIA SI NO SOLO LOS MINUTOS.
            horaRestante = (horaCierre-1) - hora;
            minRestante = minutoCierre - min;
            if (((hora > horaApertura && hora < horaCierre)) || (hora == horaApertura && min >=minApertura))
            {
                System.out.println("El Comercio se encuentra Abierto quedan " + horaRestante +
                        " Hora " + minRestante  + " Minutos para cerrar");
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