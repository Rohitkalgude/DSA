package String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        String reversed = "";


        for (int i=name.length()-1; i>=0; i--){
            reversed = reversed + name.charAt(i);
        }

        System.out.println("revered name \n" +reversed);
    }
}
