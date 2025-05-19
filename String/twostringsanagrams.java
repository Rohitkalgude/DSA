package String;

import java.util.Arrays;
import java.util.Scanner;

public class twostringsanagrams {
    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);
        System.out.println(" Enter the first ");

        Scanner second = new Scanner(System.in);
        System.out.println(" Enter the second ");

        String name1 = first.next();
        String name2 = second.next();

        if (name1.length() != name2.length()){
            System.out.println("not anagrams");
        }
        else {
            char [] ch1 = name1.toCharArray();
            char [] ch2 = name2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1,ch2)){
                System.out.println("yes anagrams");
            }
            else {
                System.out.println("not anagrams");
            }
        }
    }
}
