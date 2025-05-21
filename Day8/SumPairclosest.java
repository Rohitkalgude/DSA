package Day8;

public class SumPairclosest {
    public static int sum(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        int maxandmin = Integer.MAX_VALUE;

        while (start < end){
            int sum = arr[start] + arr[end];
            int diff = Math.abs(sum - target);

            if (sum == target){
                System.out.println("[]" +sum);
            }
            else if (start > end) {
                start++;
            }
            else if (start < end) {
                end--;
            }
        }
        return maxandmin;
    }


    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 5};
        int target = 25;
        sum(arr, target);
    }
}
