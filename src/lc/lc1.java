package lc;

import java.util.Arrays;

public class lc1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,16};
        int target = 27;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]+nums[j] == target){

                    return new int[]{i,j};
                }
            }
        }
        return null;

    }
}
