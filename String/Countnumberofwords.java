package String;

public class Countnumberofwords {
    public static void main(String[] args) {

        String name = "Rohit";

        int count = 0;


        for (int i=0; i<name.length(); i++){
            count++;
        }
        System.out.println(" Count the number of words in a string "+count);
    }
}
