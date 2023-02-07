package org.example;
import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums, int max_num) {
        Arrays.sort(nums);
        for (int i = 1; i < max_num; i++) {
            if (i != nums[i-1]) {
                return i;
            }
        }

        if (nums.length == max_num && nums[max_num - 1] == max_num) {
            return 0;
        }
        return max_num;
    }

    public static int missingNumberSort(int[] nums, int max_num) {
        Arrays.sort(nums);

        for (int i = 1; i < max_num; i++) {
            if (i != nums[i-1]) {
                return i;
            }
        }

        if (nums.length == max_num && nums[max_num - 1] == max_num) {
            return 0;
        }

        return max_num;
    }

    public static int missingNumberSum(int[] nums, int max_num) {
        int expectedSum = 0;
        for (int i = 1; i <= max_num; i++) {
            expectedSum += i;
        }

        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }

}
