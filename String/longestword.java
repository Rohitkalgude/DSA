package String;

public class longestword {
    public static void main(String[] args) {

        String name = "Java is a programming language";
        String longestWord = "";

        String[] words = name.split(" ");

        for (int i=0; i<words.length; i++){
            if (words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        System.out.println(" longestWord :"+longestWord);
    }
}
