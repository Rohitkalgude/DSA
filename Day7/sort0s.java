package Day7;

import java.util.Arrays;

public class sort0s {
    public static void sorts(int[] arr) {
//
//        int low = 0;
//        int mid = 0;
//        int high = arr.length-1;
//
//        while (mid <= high){
//            if (arr[mid] == 0){
//                int swap = arr[low];
//                arr[low] = arr[mid];
//                arr[mid] = swap;
//
//                low++;
//                mid++;
//            }
//            else if (arr[mid] == 1) {
//                mid++;
//            }
//            else {
//                int swap = arr[mid];
//                arr[mid] = arr[high];
//                arr[high] = swap;
//
//                high--;
//            }
//        }


        int low = 0;
        int mid = 0;
        int high = 0;


        for (int i=0; i< arr.length; i++){
            if (arr[i] == 0){
                low++;
            }
            else if (arr[i] == 1){
                mid++;
            }
            else if (arr[i] == 2) {
                high++;
            }
        }

        int index = 0;

        while(low > 0){
            arr[index++] = 0;
            low--;
        }

        while(mid > 0){
            arr[index++] = 1;
            mid--;
        }

        while (high > 0){
            arr[index++] = 2;
            high--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2};
        sorts(arr);
        System.out.println(" Sort an array of 0s, 1s and 2s\n "+Arrays.toString(arr));
    }
}
