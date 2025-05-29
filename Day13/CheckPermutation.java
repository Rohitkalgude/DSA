package Day13;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean search(String txt , String pat ) {
        int n = txt.length();
        int m = pat.length();

        int[] patFreq = new int[26];
        int[] windows = new int[26];

        // Count frequencies of pat and first window of txt
        for (int i=0; i<m; i++){
            patFreq[pat.charAt(i) - 'a']++;
            windows[txt.charAt(i) - 'a']++;
        }

        if (Arrays.equals(patFreq, windows)){
            return true;
        }

        // Slide the window over txt
        for (int i=m; i<n; i++){
            windows[txt.charAt(i-m) - 'a']--;
            windows[txt.charAt(i)- 'a']++;

            if (Arrays.equals(patFreq, windows)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String txt = "geeks";
        String pat = "eke";

        System.out.println(search(txt, pat));
    }
}
