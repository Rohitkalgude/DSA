package TwoPointer;

import java.util.Arrays;

public class removedulicates {

    public static int remove(int arr[]) {

        Arrays.sort(arr);
        int number = 1;

        for (int i=1; i<arr.length; i++){
            if (arr[i] != arr[number-1]){
               arr[number]= arr[i];
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4,5,5};
        int result = remove(arr);

        System.out.println(" remove duplicated " + Arrays.toString(Arrays.copyOf(arr, result)));
        System.out.println(" remove duplicated sorted array "+ result);
    }
}
