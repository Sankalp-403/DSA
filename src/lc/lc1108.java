package lc;

public class    lc1108 {
    public static void main(String[] args) {
        String string = "1.1.1.1";
        System.out.println(str(string));
    }
    static String str(String string ){
        String s1 = string.replace(".", "[.]");
        return s1;
    }
}
