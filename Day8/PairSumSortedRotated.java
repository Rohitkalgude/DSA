package Day8;

import java.util.Arrays;

public class PairSumSortedRotated {
    public static boolean sum(int[] arr, int target) {

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int sum = arr[start] + arr[end];

            if (sum == target){
                System.out.println("true");
                return true;
            }
            else if (sum < target) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {7,9,1,3,5};
        int target = 6;
        sum(arr, target);
    }
}






//
//package Day8;
//
//import java.util.Arrays;
//
//public class PairSumSortedRotated {
//    public static boolean sum(int[] arr, int target) {
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j<arr.length; j++){
//                if (i!=j && arr[i]+arr[j]==target){
//                    System.out.println("true");
//                    return true;
//                }
//            }
//        }
//        System.out.println("false");
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {7,9,1,3,5};
//        int target = 6;
//        sum(arr, target);
//    }
//}
//
