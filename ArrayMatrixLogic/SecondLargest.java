package ArrayMatrixLogic;

public class SecondLargest {
    public static int second(int[] arr) {
        
        int largest = arr[0];
        int seclargest = Integer.MIN_VALUE;

        //first largest
        for (int i=0; i<arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        //second way second largest find
        for (int i=0; i< arr.length; i++){
            if (arr[i] > seclargest && arr[i] < largest){
                seclargest = arr[i];
            }
        }

        return seclargest;
    }

    public static void main(String[] args) {
        int arr[] = {23,67,45,89};
        int result = second(arr);
        System.out.println(" Second largest "+result);
    }
}
