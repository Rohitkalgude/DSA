package logical;

public class powerofanumber {
    public static void main(String[] args) {

//        int powerofnumber = (int) Math.pow(2, 3);
//        System.out.println("Calculate the power of a number " +powerofnumber);


         int number = 3;
         int base = 2;
         int result = 1;

         for (int i=1; i<=number; i++){
             result = result * base;
         }

        System.out.println("Calculate the power "+result);
    }
}
