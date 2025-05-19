package ArrayMatrixLogic;

import java.util.Arrays;

public class Mergetwoarrays {
    public static void main(String[] args) {

        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        int Merge[] = new int[arr1.length + arr2.length];

        int merge = 0;

        for (int i=0; i<arr1.length; i++){
            Merge[merge++] = arr1[i];
        }

        for (int j=0; j<arr2.length; j++){
            Merge[merge++] = arr2[j];
        }

        System.out.println(" Merge array "+ Arrays.toString(Merge));
    }
}
