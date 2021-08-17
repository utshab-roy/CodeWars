package com.utshab;

import java.util.Arrays;

public class UniqueNumber {
    /**
     * problem link
     * https://www.codewars.com/kata/585d7d5adb20cf33cb000235
     *
     *
     * @param arr
     * @return
     */
    public static double findUniq(double arr[]) {
        double firstVal = arr[0];
        double secondVal = arr[1];

        if (firstVal == secondVal){
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] != firstVal)
                    return arr[i];
            }
        }else{
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] == firstVal)
                    return secondVal;
                if (arr[i] == secondVal)
                    return firstVal;
            }
        }
        return arr[0];
    }

    /**
     * best practice solution
     * @param arr
     * @return
     */
    public static double findUniqBest(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}
