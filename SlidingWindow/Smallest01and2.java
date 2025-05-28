package SlidingWindow;

public class Smallest01and2 {
    public static int smallestSubstring(String S) {

        int count = Integer.MAX_VALUE;
        boolean zero = false;
        boolean one = false;
        boolean two = false;

        int zeroindex = -1;
        int oneindex = -1;
        int twoindex = -1;


        for (int i=0; i<S.length(); i++){
            if (S.charAt(i) == '0'){
                zero = true;
                zeroindex = i;
            }
            else if (S.charAt(i) == '1') {
                one = true;
                oneindex = i;
            }
            else if (S.charAt(i) == '2') {
                two = true;
                twoindex = i;
            }

            if(zero && one && two){
                int Max = Math.max(zeroindex, Math.max(oneindex, twoindex));
                int Min = Math.min(zeroindex, Math.min(oneindex,twoindex));

                count = Math.min(count, Max - Min + 1);
            }
        }
         return count == Integer.MAX_VALUE ? -1 : count;
    }

    public static void main(String[] args) {
        String S = "10212";
        System.out.println(smallestSubstring(S));
    }
}
