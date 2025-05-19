package Basic;

public class palindrome {
    public static void main(String[] args) {


        int number = 121;
        int reversed = 0;
        int original = number;

        while (number != 0){

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }

        if (original == reversed){
            System.out.println(" palindrome " + original);
        }
        else {
            System.out.println(" not palindrome " + original);
        }
    }
}
