package lc;

public class LC1903 {
    public static void main(String[] args) {

//        largestOdd("52");
        System.out.println(largestOdd("35427"));
    }

    static String largestOdd(String num){
        if(num.isEmpty()){
            return "";
        }

            String sb1 = " ";
            for (int i = num.length()-1; i >= 0 ; i--) {
                if (num.charAt(i) % 2 !=0){
                    sb1 = num.substring(0,i+1);
                    break;

                }

            }
            return sb1;

        
    }

}
