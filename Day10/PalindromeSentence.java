package Day10;

public class PalindromeSentence {
    public static boolean sentencePalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while (start < end){

            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Too hot to hoot";
        System.out.println(sentencePalindrome(s) ? "yes" : "no");
    }
}
