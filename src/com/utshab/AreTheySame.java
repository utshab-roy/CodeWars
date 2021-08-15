package com.utshab;

import java.util.Arrays;

public class AreTheySame {
    /**
     * problem link
     * https://www.codewars.com/kata/550498447451fbbd7600041c
     * REMARK: one test failed
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null)
            return false;
        if (a.length != b.length)
            return false;
        if (a.length == 0 && b.length == 0)
            return true;

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.abs(a[i]) * Math.abs(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = Math.abs(b[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        comp(new int[]{3, 1, 2}, new int[]{1, 9, 4});
    }
}
