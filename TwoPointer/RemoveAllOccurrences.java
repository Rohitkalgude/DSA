package TwoPointer;

public class RemoveAllOccurrences {
    public static int remove(int[] arr, int ele) {

        int k = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] != ele) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int ele = 3;

        int result = remove(arr, ele);
        System.out.println(" Remove All Occurrences " +result);
    }
}
