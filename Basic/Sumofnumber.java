package Basic;

public class Sumofnumber {
    public static void main(String[] args) {

        int number = 10;
        int sum = 0;

        for(int i=1; i<=number; i++){
            sum = sum + i;
        }

        System.out.println(" sum of number " +sum);
    }
}
