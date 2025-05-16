package Pattern;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci "+a);
        System.out.println("Fibonacci "+b);

        for(int i=0; i<n; i++){
            int sum = a + b;

            System.out.println("Fibonacci "+sum);
            a = b;
            b = sum;


        }
    }
}
