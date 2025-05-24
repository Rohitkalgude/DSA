package Day11;

public class DominantPairs {
    public static int Dominant( int[] arr) {

        int n = arr.length;
        int count = 0;

        for (int i=0; i< n/2; i++){
            for (int j=n/2; j<n; j++){
                if (arr[i] >= 5 * arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {10,2,2,1};
        System.out.println(Dominant(arr));
    }
}
