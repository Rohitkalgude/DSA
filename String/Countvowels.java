package String;

import java.util.Scanner;

public class Countvowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char");

        String character = sc.next();
        int countvowles = 0;

        character = character.toLowerCase();

        for (int i=0; i<character.length(); i++){

            char ch = character.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countvowles++;
            }
        }

        System.out.println(" vowles " +countvowles);
    }
}
