package Pattern;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        //upper
        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            for (int k=1; k<=2*(number-i); k++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //down
        for (int i=number; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            for (int k=1; k<=2*(number-i); k++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
