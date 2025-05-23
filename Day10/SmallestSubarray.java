package Day10;

public class SmallestSubarray {
    public static int subarray(int[] arr, int x) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];

            // sum greater than
            while (sum > x){
                minLength = Math.min(minLength, i - start + 1);
                sum -= arr[start++];
            }
        }

        //length and 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {

        int arr[] = {1,4,45,6,0,19};
        int x = 51;
        System.out.println(subarray(arr, x));

    }
}
