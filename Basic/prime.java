package Basic;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();


        boolean isprime = true;

        if (number <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        System.out.println(number + (isprime ? " is prime number " : " not a prime number "));
    }
}