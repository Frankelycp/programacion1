
import inputReader.InputReader;

public class Ejercicio_6 {
    public static void main(String[] args) {

//        Escribir un programa que pida se ingresen datos necesarios para
//        emitir una factura por la compra de dos artículos de librería (tipo
//        factura, número, nombre cliente, producto 1, importe 1, producto 2,
//        importe 2, importe total). Como salida debe imprimir por pantalla la
//        factura en un formato similar al del siguiente ejemplo:

//        Factura C N 249
//        Nombre: Juan Perez
//        Producto Importe
//        Lápiz 15.5
//        Papel 20.6
//        Importe total 36.1

        System.out.println("Ingrese los datos para generar la factura:");
        System.out.println("Tipo de Factura");
        String tipo = InputReader.nextLine().toUpperCase();
        System.out.println("Numero de Factura");
        String numero = InputReader.nextLine().toUpperCase();
        System.out.println("Nombre del Cliente");
        String nombre = InputReader.nextLine().toUpperCase();
        System.out.print("Producto 1: ");
        String producto1 = InputReader.nextLine();
        System.out.println("Importe Producto 1");
        double importe1 = InputReader.nextDouble();
        InputReader.nextLine();
        System.out.print("Producto 2: ");
        String producto2 = InputReader.nextLine();
        System.out.println("Importe Producto 2");
        double importe2 = InputReader.nextDouble();
        double importeTotal = importe1+importe2;

        System.out.println("Factura\t\t\t" + tipo + "\t\tN"+ numero+
                "\n" + "Nombre: " + nombre +"\n"
                + "Producto \t\t\t\tImporte\n"
                + producto1+" \t\t\t\t\t" +importe1+"\n"
                + producto2+" \t\t\t\t" +importe2+"\n"
                + "Importe Total \t\t\t"+ importeTotal);
    }
}