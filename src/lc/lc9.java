package lc;

public class lc9 {
    public static void main(String[] args) {
        String x = "abcba";
         System.out.println(isPalindrome(x));
//          System.out.println(isPalindrome(121));

    }

    //    static boolean isPalindrome(int x) {
//        int original = x;
//        int reversed = 0;
//        while ( x != 0) {
//            int digit  = x % 10;
//            reversed = reversed * 10 + digit;
//            x = x / 10;
//        }
//
//
//
//        return original==reversed;
//    }
    static boolean isPalindrome(String x){
       x=  x.toLowerCase();
        for (int i = 0; i < x.length() /2; i++) {
            int start = x.charAt(i);
            int end = x.charAt(x.length()-1-i);
            if (start != end ) {
                return false;
            }

        }
        return true;

    }

}
