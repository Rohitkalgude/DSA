package Day7;

public class PairSumSortedArray {
    public static boolean sum(int[] arr, int target) {

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("true");
                    return true;
                }
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {

        int arr[] = {2,3,4,1};
        int target = 3;
        sum(arr, target);

    }
}
