package TwoPointer;

import java.util.Arrays;

public class Zerotoend {
    public static int zeroo(int[] arr ) {

        int zero = 0;

        for(int i=0; i< arr.length; i++) {
            if (arr[i] != 0) {
                arr[zero++] = arr[i];
            }
        }
            while (zero < arr.length) {
                arr[zero++] = 0;
            }

        return  zero;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,0,4,3,0,5,0};
        zeroo(arr);

        System.out.println(" all zero end "+ Arrays.toString(arr));
    }
}
