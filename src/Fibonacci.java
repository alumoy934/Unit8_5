import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numboer of elements for fibonacci: ");
        int limit = input.nextInt();

        System.out.print("[");
        for (int i = 0; i < limit; i++) {
            if (i == limit -1){
                System.out.print(fibonacci(i));
            }else{
                System.out.print(fibonacci(i)+ " ,");
            }
        }
        System.out.print("]");
    }

    public static int fibonacci (int num){

        if ( num == 0 || num == 1) {
            return num;
        }else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

} //class


