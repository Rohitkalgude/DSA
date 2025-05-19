package String;

import java.util.Scanner;

public class uppercaseandlowercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        String lower = name.toLowerCase();
        String upper = name.toUpperCase();

        System.out.println(lower);
        System.out.println(upper);

    }
}
