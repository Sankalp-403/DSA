package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        // Sample unsorted array
        int[] numbers = {5, 4, 6, 1, 2, 3};

        // Printing the sorted array using insertion sort
        System.out.println(Arrays.toString(insertionSort(numbers)));
    }


    public static int[] insertionSort(int[] numbers) {
        // Traverse from second element to the end of the array
        for (int i = 0; i < numbers.length - 1; i++) {
            // Compare the current element with its predecessors and shift them
            for (int j = i + 1; j > 0; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    // Swap the elements if the previous is greater than the current
                    int temp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                } else {
                    // Break if the current pair is in correct order
                    break;
                }
            }
        }
        return numbers;
    }
}

