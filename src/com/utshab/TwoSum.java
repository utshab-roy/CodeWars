package com.utshab;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /**
     * problem link
     * https://www.codewars.com/kata/52c31f8e6605bcc646000082
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complaints = target - numbers[i];
            if (map.containsKey(complaints))
                return new int[] {map.get(complaints), i};
            map.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
    }
}
