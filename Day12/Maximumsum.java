package Day12;

public class Maximumsum {
    public static int sum(int[] arr, int x) {

        int result = 0;

        for (int i=0; i< arr.length; i++){
            int currsum  = 0;

            for (int j=i; j< arr.length; j++){
                currsum += arr[j];

                if (currsum < x){
                    result = Math.max(currsum, result);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x = 11;
        System.out.println(sum(arr, x));
    }
}
