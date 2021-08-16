package com.utshab;

public class FindOddInt {
    /**
     * problem link
     * https://www.codewars.com/kata/54da5a58ea159efa38000836
     *
     * @param a
     * @return
     */
    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int currentInteger = a[i];
            int count = 0;
            for (int j = 0; j < a.length; j++) { // can it be solved without nested loop
                if (currentInteger == a[j])
                    count++;
            }
            if (count % 2 != 0) // count is odd
                return currentInteger;
        }
        return 0;
    }
}
