package Day7;

public class reversewithspaces {
    public static String reverse(String s) {

        char[] chars = s.toCharArray();
        int i = 0, j = s.length()-1;

       while (i < j){
           if (chars[i] == ' '){
               i++;
           } else if (chars[j] == ' ') {
               j--;
           }
           else {
               char swap = chars[i];
               chars[i] = chars[j];
               chars[j] = swap;

               i++;
               j--;
           }
       }
       return new String(chars);
    }


    public static void main(String[] args) {
        String input = "Help others";
        String result = reverse(input);
        System.out.println("Reversed with spaces: " + result);
    }
}
