package inputReader;

import java.util.Scanner;

public class InputReader {
    private static Scanner sc = new Scanner(System.in);

    public static int nextInt() {
        return sc.nextInt();
    }

    public static double nextDouble() {
        return sc.nextDouble();
    }

    public static String nextLine() {
        return sc.nextLine();
    }

    public static char nextChar() {return sc.next().charAt(0);
    }


//    public static void closeScanner() {
//        sc.close();
//    }
}