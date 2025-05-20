package Day7;

public class TwoSum {
    public static boolean sum(int[] arr, int target) {


        for (int i=0; i<arr.length; i++){
          for (int j=i+1; j<arr.length; j++){
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

        int arr[] = {1,4,45,6,10,8};
        int target = 16;
        sum(arr, target);

    }
}
