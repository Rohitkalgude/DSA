package Day1;

public class largest {

    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1; // No second largest found
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 9};
        int result = getSecondLargest(arr);
        System.out.println("Second Largest: " + result);
    }
}



//
//package Day1;
//public class largest {
//    public static int getSecondLargest(int[] arr) {
//        if (arr.length < 2) return -1;
//
//        int largest = arr[0];
//        int seclargest = -1;
//
//        for(int i=1; i<arr.length; i++ ){
//            if(arr[i] > largest){
//                seclargest = largest;
//                 largest = arr[i];
//            } else if (arr[i] < largest && arr[i] > seclargest) {
//                seclargest = arr[i];
//            }
//        }
//
//        return seclargest;
//    }
//
//
//    public static void main(String[] args) {
//        int []arr = {12, 14, 10, 13};
//        int result = getSecondLargest(arr);
//        System.out.println("Second largest"  +result);
//    }
//}
//
