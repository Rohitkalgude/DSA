package ArrayMatrixLogic;

public class Largestelement {
    public static int largest(int[] arr) {

        int number = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > number ){
                number = arr[i];
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int arr[] = {1,34,56,-100,23};
        int result = largest(arr);
        System.out.println(" largest element "+result);
    }
}
