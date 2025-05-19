package ArrayMatrixLogic;

public class sumofarray {
    public static int sum(int[] arr) {
        int sum = 0;

        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result = sum(arr);
        System.out.println(" Find the sum of array elements " +result);
    }
}
