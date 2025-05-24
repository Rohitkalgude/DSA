package SlidingWindow;

public class MaxSum {
    public static String max(int[] arr, int k) {
        int n = arr.length;

        if (k > n) {
            return "Invalid";
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxsum = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            maxsum = Math.max(maxsum, sum);
        }

        return String.valueOf(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 4;
        System.out.println(max(arr, k));
    }
}
