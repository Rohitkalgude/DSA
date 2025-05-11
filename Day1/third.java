//package Day1;
//
//public class third {
//    public static int getthirdlargest(int[] arr) {
//        int largest = Integer.MIN_VALUE;
//        int seclargest = Integer.MIN_VALUE;
//        int thiedlargest = Integer.MIN_VALUE;
//
//        int n = arr.length;
//
//        for(int i=0; i<n; i++){
//            if (arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            if (arr[i] > seclargest && arr[i] < largest){
//                seclargest = arr[i];
//            }
//        }
//
//        for (int i=0; i<n; i++){
//            if (arr[i] > thiedlargest && arr[i] < seclargest){
//                thiedlargest = arr[i];
//            }
//        }
//
//        if (thiedlargest == Integer.MIN_VALUE){
//            return  - 1;
//        }
//
//        return thiedlargest;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {12,13};
//        int result = getthirdlargest(arr);
//        System.out.println("third largest "+ result);
//    }
//}
//






package Day1;

public class third {
    public static int getthirdlargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        int thilargest = Integer.MIN_VALUE;

        int n = arr.length;

        for(int i=0; i<n; i++){
            if (arr[i] > largest){
                thilargest = seclargest;
                seclargest = largest;
                largest = arr[i];
            } else if (arr[i] > seclargest && arr[i] < largest) {
                seclargest = arr[i];
            } else if (arr[i] > thilargest && arr[i] < seclargest) {
                thilargest = arr[i];
            }

        }

        if (thilargest == Integer.MIN_VALUE){
            return -1;
        }

        return thilargest;
    }

    public static void main(String[] args) {
        int arr[] = {12,13,14,5};
        int result = getthirdlargest(arr);
        System.out.println("third largest "+result);
    }
}