package Day4;

public class RotateClock {
    // Function to rotate the array by d positions to the left (counter-clockwise).
    public static void Rotate(int arr[], int d) {
        int n = arr.length;

        d = d % n;

        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;

        Rotate(arr, d);

        System.out.println("\nArray after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
