package com.utshab;

import java.util.Arrays;

public class DataReverse {
    /**
     * problem link
     * https://www.codewars.com/kata/569d488d61b812a0f7000015
     *
     * @param data
     * @return
     */
    public static int[] dataReverse(int[] data) {
        int len = data.length;
        if (len == 0 || len == 8)
            return data;

        int numOfSegment = len / 8;

        // reverse the whole array
        for (int i = 0; i < data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }

        // now we have to reverse each segment (8 values as chunk data)
        int startVal = 0;
        for (int i = 1; i <= numOfSegment; i++) {
            int endVal = i * 8;
            for (int j = startVal; j < endVal - 4; j++) {
                int temp = data[j];
                data[j] = data[endVal - j - 1]; // problem is in this line
                data[endVal - j - 1] = temp;
            }

            startVal = endVal;
        }

        System.out.println(Arrays.toString(data));
        return data;
    }

    public static void main(String[] args) {
        dataReverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8});
    }
}
