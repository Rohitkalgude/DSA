package Pattern;

public class Armstrong {
    public static void main(String[] args) {
        int number = 123;
        int result = 0;
        int original = number;

        int digits = String.valueOf(number).length();

        while (number != 0){
            int digit = number % 10;
            result +=  Math.pow(digit, digits);
            number = number / 10;
        }

        if (original == result){
            System.out.println(" Armstrong " +original);
        }
        else {
            System.out.println(" Not Armstrong " +original);
        }
    }
}
