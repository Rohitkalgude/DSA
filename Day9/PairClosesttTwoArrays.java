package Day9;

import java.util.ArrayList;
import java.util.Arrays;

public class PairClosesttTwoArrays {

    public static ArrayList<Integer> closest(int[] arr, int[] bar, int n, int m, int target) {

        ArrayList <Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        Arrays.sort(bar);

        int start = 0;
        int end = m-1;
        int diff = Integer.MAX_VALUE;
        int a = -1;
        int b = -1;


        while (start < n && end >= 0){

            int sum = arr[start] + bar[end];
            int currdiff = Math.abs(sum - target);

            if(currdiff < diff){
                diff = currdiff;
                a = arr[start];
                b = bar[end];
            }

            if (sum < target){
                start++;
            }
            else {
                end--;
            }
        }

        list.add(a);
        list.add(b);

        return list;
    }


    public static void main(String[] args) {
        int arr[] = {1,4,5,7};
        int bar[] = {10,20,30,40};
        int target = 32;

        ArrayList <Integer> result = closest(arr, bar, arr.length, bar.length, target);
        System.out.println(result);
    }
}
