package com.utshab;

public class FindOutlier {
    /**
     * problem link
     * https://www.codewars.com/kata/5526fc09a1bbd946250002dc
     *
     * @param integers
     * @return
     */
    static int find(int[] integers) {
        int[] myArray = integers.clone();
        int odd = 0, even = 0;
        for (int i = 0; i < 3; i++) { // to determine weather we are looking even or odd
            if (myArray[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        if (even > odd) { // find the odd
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] % 2 != 0)
                    return myArray[i];
            }
        } else { // find the even
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] % 2 == 0)
                    return myArray[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36});
    }
}
