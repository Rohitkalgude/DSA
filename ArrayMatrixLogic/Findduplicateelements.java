package ArrayMatrixLogic;

public class Findduplicateelements {

    public static void find(int[] arr) {

        System.out.println(" Find the duplicate elements in an array ");

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,2};
        find(arr);
    }
}
