package Day6;

public class RemoveElement {
    public static int removeelemet(int[] arr, int ele) {

        int k = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if (arr[i] != ele){
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,0,2,2,4,2};
        int ele = 2;
        int result = removeelemet(arr, ele);
        System.out.println("Output: " + result);


        System.out.print("Modified array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
