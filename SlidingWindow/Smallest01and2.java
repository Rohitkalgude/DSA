//package SlidingWindow;
//
//public class Smallest01and2 {
//    public static int smallestSubstring(String S) {
//
//        int count = Integer.MAX_VALUE;
//        boolean zero = false;
//        boolean one = false;
//        boolean two = false;
//
//        int zeroindex = 0;
//        int oneindex = 0;
//        int twoindex = 0;
//
//
//        for (int i=0; i<S.length(); i++){
//            if (S.charAt(i) == '0'){
//                zero = true;
//                zeroindex = i;
//            }
//            else if (S.charAt(i) == '1') {
//                one = true;
//                oneindex = i;
//            }
//            else if (S.charAt(i) == '2') {
//                two = true;
//                twoindex = i;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        String S = "1O212";
//        System.out.println(smallestSubstring(S));
//    }
//}
