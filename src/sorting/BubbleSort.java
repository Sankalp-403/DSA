package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        // Input array to be sorted
        int[] nums = {5, 4, 2, 3, 1};

        // Print the sorted array
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    // Method to perform bubble sort
    public static int[] bubbleSort(int[] nums) {
        // Outer loop: controls the number of passes
        for (int i = 0; i < nums.length; i++) {

            // Inner loop: compares adjacent elements and pushes the largest to the end
            for (int j = 1; j < nums.length - i; j++) {

                // Swap if previous element is greater than current
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        // Return the sorted array
        return nums;
    }
}
