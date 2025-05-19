package Day6;

import java.util.Vector;
import java.util.Collections;

public class Oneplue {
     Vector<Integer> addone(int[] arr){
        Vector<Integer> vector = new Vector<>();

        int n = arr.length;
        int last = 1;


        for(int i = n-1; i >=0; i--){
            int sum = arr[i] + last;

            if (sum > 9){
                vector.add(0);
                last = 1;
            }
            else {
                vector.add(sum);
                last = 0;
            }
        }

        if (last == 1){
            vector.add(1);
        }

        Collections.reverse(vector);
        return vector;
    }

    public static void main(String[] args) {
         Oneplue oneplue = new Oneplue();
         int []arr = {1,2,3,4};
        Vector<Integer> result = oneplue.addone(arr);
        System.out.println("output");

        for (int num: result){
            System.out.println(num+ "");
        }

    }
}
