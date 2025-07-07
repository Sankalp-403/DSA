package lc;

// Class name should use PascalCase
public class Lc258 {

    public static void main(String[] args) {
        int num = 38;
        // Call the method and print the result
        System.out.println(sumOfDigits(num));
    }


    public static int sumOfDigits(int num) {
        // Repeat the process until num becomes a single-digit
        while (num >= 10) {
            int sum = 0;

            // Extract and sum all digits of the current number
            while (num > 0) {
                sum += num % 10; // Add the last digit
                num /= 10;       // Remove the last digit
            }

            // Replace num with the sum of its digits
            num = sum;
        }

        return num;
    }
}
