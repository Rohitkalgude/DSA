package Day8;

import java.util.Arrays;

public class SumPairclosest {
    public static int sum(int[] arr, int target) {

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        int closetsum = arr[start] + arr[end];
        int mindiff = Math.abs(closetsum - target);

        while (start < end){

            int sum = arr[start] + arr[end];
            int currentdiff = Math.abs(sum - target);

            if (currentdiff < mindiff){
                mindiff = currentdiff;
                closetsum = currentdiff;
            }
            else if (closetsum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println("Closest Sum" +closetsum);
        return closetsum;
    }


    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 5};
        int target = 25;
        sum(arr, target);
    }
}
