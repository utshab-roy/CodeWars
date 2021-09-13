package com.utshab.leetcode;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) // found the target
                return mid;
            else if (target < nums[mid]) // target is in the right
                right = mid - 1;
            else // target is in the left
                left = mid + 1;
        }
        // target is not in the list
        return -1;
    }

    public static void main(String[] args) {
        int res = search(new int[] {-1,0,3,5,9,12}, 9);
        System.out.println(res);
    }
}
