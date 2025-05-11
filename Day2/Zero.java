package Day2;

import java.util.Arrays;

public class Zero {
    public static void MoveZeroToEnd(int[] arr) {

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 30, 5, 0};
        MoveZeroToEnd(arr);
        System.out.println("Updated Array: " + Arrays.toString(arr));
    }
}
