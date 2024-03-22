import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char caracter = 'a';
        float importe = 5.5f;
        String nombre  = "juan";
        byte edad = 13;
        // para tabular \t y para saltear la linea es \n
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Base");
        String a = sc.nextLine();
//        System.out.println(a);
        int base = Integer.parseInt(a);


        System.out.println("Ingrese Altura");
        String b = sc.nextLine();
//        System.out.println(b);
        Integer altura = Integer.parseInt(b);

        if (base > altura){

            System.out.println("La base es mayor a la Altura" + base);
        }

        System.out.println("La base por altura es = " + base*altura);

    }
}