package Day14;

public class CountIncreasing {
    public static int count(int[] arr) {

        int count = 0;

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[j-1] >= arr[j]){
                    break;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,3,2,3,5};
        System.out.println(count(arr));
    }
}
