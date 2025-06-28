package sorting;

import java.util.Arrays;


public class SelectionSort {

    public static void main(String[] args) {
        // Sample unsorted array
        int[] numbers = {4, 5, 1, 2, 3};

        // Sort the array and print the result
        System.out.println(Arrays.toString(sortArray(numbers)));
    }


    public static int[] sortArray(int[] numbers) {
        // Outer loop moves from start to second-last element
        for (int i = 0; i < numbers.length; i++) {
            // Calculate the index of the last unsorted element
            int last = numbers.length - i - 1;
            int maxIndex = 0;

            // Find the index of the maximum element in the unsorted portion
            for (int j = 0; j <= last; j++) {
                if (numbers[maxIndex] < numbers[j]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the last unsorted element
            int temp = numbers[last];
            numbers[last] = numbers[maxIndex];
            numbers[maxIndex] = temp;
        }

        return numbers;
    }
}
