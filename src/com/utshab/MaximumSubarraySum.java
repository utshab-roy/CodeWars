package com.utshab;

public class MaximumSubarraySum {
    /**
     * problem link
     * https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
     *
     * @param arr
     * @return
     */
    public static int sequence(int[] arr) { // my solution
        int[] myArray = arr.clone();
        if (myArray.length < 1)
            return 0;

        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 1)
                continue;
            int sum = myArray[i];
            for (int j = i + 1; j < myArray.length; j++) {
                sum += myArray[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }

    public static int sequenceBest(int[] arr) { // best solution
        int max_ending_here = 0, max_so_far = 0;
        for (int v : arr) {
            max_ending_here = Math.max(0, max_ending_here + v);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
}
