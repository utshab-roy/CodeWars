package com.utshab.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {
    /**
     * problem link
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) { // my solution
        if (nums.length == 0) return 0;

        int i = 0, j = 1, k = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
                k++;
            }
        }
        return k;
    }

    public static int removeDuplicatesCopy(int[] nums) { // another approach copy from net
        if (nums.length == 0) return 0;

        int currUniqueElePos = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                nums[++currUniqueElePos] = nums[i];
            }
        }

        return currUniqueElePos + 1;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }
}
