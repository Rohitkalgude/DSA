package Pattern;

import java.util.Scanner;

public class reversepyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        for (int i=0; i<number; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }

            for (int k=0; k<2*(number-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
