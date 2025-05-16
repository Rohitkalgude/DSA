package Pattern;

public class Reverseanumber {
    public static void main(String[] args) {

        int number = 123456789;
        int reverse = 0;

        while (number != 0){
            int digist = number % 10;
            reverse = reverse * 10 + digist;
            number = number / 10;
        }

        System.out.println(" reverse number " +reverse);

    }
}
