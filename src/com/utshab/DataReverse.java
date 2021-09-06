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
        int[] myArray = data.clone(); // for random test pass making copy of the original array
        int len = myArray.length;
        if (len == 0 || len == 8) // if there is only one or no segment then nothing to do
            return myArray;

        int numOfSegment = len / 8;

        // reverse the whole array
        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }

        // now we have to reverse each segment (8 values as chunk myArray)
        int startVal = 0;
        for (int i = 1; i <= numOfSegment; i++) {
            int endVal = i * 8;
            int loopEndIndex = endVal - 4;
            for (int j = startVal; j < loopEndIndex; j++) {
                int temp = myArray[j];
                myArray[j] = myArray[endVal - 1];
                myArray[endVal - 1] = temp;
                endVal--;
            }
            startVal = i * 8;
        }
        return myArray;
    }

    public static void main(String[] args) {
        //passed all the test cases but failed in the attempt
        System.out.println(Arrays.toString(dataReverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8})));
    }
}
