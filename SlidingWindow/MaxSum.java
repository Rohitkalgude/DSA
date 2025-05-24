package SlidingWindow;

public class MaxSum {
    public static int max(int[] arr, int k) {

        int n = arr.length;
        int sum = 0;
        int maxsum = sum;


        if (k > n){
            return -1;
        }

        //sum
        for (int i=0; i<k; i++){
            sum += arr[i];
        }

        //windows
        for (int i=k; i<arr.length; i++){
            sum = sum + arr[i] - arr[i - k];
            sum = Math.max(sum, maxsum);
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {100,200,300,400};
        int k = 4;
        System.out.println(max(arr, k));
    }
}

