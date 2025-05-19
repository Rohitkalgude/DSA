package Pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        //upper
        for (int i=1; i<=number; i++){
            for (int j=1; j<=number - i; j++){
                System.out.print(" ");
            }

            for (int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }


        //
        for (int i=0; i<number; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            for (int k=0; k<2*(number - i)-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
