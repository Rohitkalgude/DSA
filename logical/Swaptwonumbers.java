package logical;

public class Swaptwonumbers {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;

//         two variable
        a = a + b;
        b = a - b;
        a = a - b;



//        thired variable
//        int swap = a;
//        a = b;
//        b = swap;

        System.out.println("After Swap: a = " + a + ", b = " + b);


    }
}
