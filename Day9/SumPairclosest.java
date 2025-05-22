package Day9;

import java.util.ArrayList;
import java.util.Arrays;

public class SumPairclosest {
    public static ArrayList<Integer> closest(int[] arr, int target) {

        ArrayList <Integer> result = new ArrayList<>();

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length-1;
        int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int a = -1;
        int b = -1;

        while (start < end){
            int sum = arr[start] + arr[end];
            int diff = Math.abs(sum - target);
            int find = Math.abs(arr[end] - arr[start]);

            //small
            if (diff < small){
                small = diff;
                max = find;
                a = arr[start];
                b = arr[end];
            }

            //largest
            else if (diff == find) {
                if(find > max){
                    max = find;
                    a = arr[start];
                    b = arr[end];
                }
            }
            if (sum < target){
                start++;
            }
            else {
                end--;
            }
        }

        if (a != -1 && b != -1) {
            result.add(Math.min(a, b));
            result.add(Math.max(a, b));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,1,7,4};
        int target = 10;

        ArrayList<Integer> res = closest(arr, target);
        System.out.println(res);
    }
}
