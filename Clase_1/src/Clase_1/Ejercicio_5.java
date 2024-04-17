package Clase_1;

import inputReader.InputReader;

public class Ejercicio_5 {
    public static void main(String[] args) {

//        Escribir un programa que solicite nombre, edad, altura y ocupación, y
//        los imprima por pantalla.

        System.out.println("Ingrese su nombre");
        String nombre = InputReader.nextLine();
        System.out.println("Ingrese su Edad");
        int edad = InputReader.nextInt();
        InputReader.nextLine();
        System.out.println("Ingrese su Ocupacion");
        String ocupacion = InputReader.nextLine();
        System.out.println("Su nombre es " + nombre + " Tiene " + edad + " Años " + "y su ocupacion es " + ocupacion );
    }
}