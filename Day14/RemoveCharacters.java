package Day14;

public class RemoveCharacters {
    public static String removeDuplicates(String S) {

        StringBuilder result = new StringBuilder();
        result.append(S.charAt(0));

        for (int i=1; i<S.length(); i++){
            if (S.charAt(i) != S.charAt(i-1)){
                result.append(S.charAt(i));
            }

//            if (result.length() == 0 || result.charAt(result.length() - 1) != S.charAt(i)){
//                result.append(S.charAt(i));
//            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabb"));
    }
}
