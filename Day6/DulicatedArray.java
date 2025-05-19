package Day6;

public class DulicatedArray {
    public static int dulicated(int[] arr) {

        int n = arr.length;
        int num = 1;

        for(int i=1; i<n; i++){
            if(arr[i] != arr[num - 1]){
                arr[num] = arr[i];
                num++;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,2,2,2};
        int result = dulicated(arr);
        System.out.println(("soretd array"+ result));
    }
}
