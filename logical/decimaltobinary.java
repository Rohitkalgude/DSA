package logical;

public class decimaltobinary {
    public static void main(String[] args) {

        int number = 2;
        String binary = "";


        while (number > 0){
            int reminder = number % 2;
            binary = reminder + binary;
            number = number / 2;
        }

        System.out.println(" decimal to binary "+binary);
    }
}
