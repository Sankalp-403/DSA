package lc;

public class lc151 {
    public static void main(String[] args) {
        reverseOfWord("the sky is blue");

    }
    static String reverseOfWord(String s){

        String[] word = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = word.length-1; i >=0; i++) {
            sb.append(word[i]);
            sb.append(" ");

        }
        return sb.toString();
    }
}
