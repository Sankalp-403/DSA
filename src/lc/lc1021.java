package lc;

public class lc1021 {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
    }
    static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')'){
                counter --;

            }
            if ( counter !=0 ){
                sb = sb.append(s.charAt(i));
            }
            if (s.charAt(i) == '('){
                counter++;
            }
        }

        return sb.toString();
    }
}
