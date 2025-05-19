package String;

import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");

        String name = sc.next();
        String reversed = "";

        for (int i=name.length()-1; i>=0; i--){
            reversed = reversed + name.charAt(i);
        }

        if (name.equalsIgnoreCase(reversed)){
            System.out.println(name + " Yes Palindrome ");
        }
        else {
            System.out.println(name + " Not Palindrome");
        }

    }
}
