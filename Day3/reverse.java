import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                Long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }
}

public class reverse {
    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
        int k = 3;

        Solution sol = new Solution();
        sol.reverseInGroups(arr, k);

        System.out.println("Reversed in groups: " + arr);
    }
}
