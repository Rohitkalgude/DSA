package Day3;

public class MaxConsecutiveOnes {

    public static int lastone(int[] arr) {
        int n = arr.length;
        int one = 0;
        int zero = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                one++;
                zero = 0;
            }
            else {
                one = 0;
                zero++;
            }

            max = Math.max(max, Math.max(zero,one));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int result = lastone(arr);
        System.out.println("MaxConsecutiveOnes" + result);
    }



}
