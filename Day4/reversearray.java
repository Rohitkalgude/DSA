package Day4;

public class reversearray {
    public static void reversearry(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        reversearry(arr);
        System.out.println("reverse :");


        for(int num: arr){
            System.out.println(num +"");
        }
    }
}
