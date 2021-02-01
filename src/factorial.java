package Unit8_5;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");

        int num = in.nextInt();

        System.out.println("El factorial de " + num + " es: " + factorial(num));

    }

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
}
