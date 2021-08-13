package com.utshab;

import java.util.Arrays;

public class AreTheySame {
    /**
     * problem link
     * https://www.codewars.com/kata/550498447451fbbd7600041c
     * REMARK: one test failed
     * @param a
     * @param b
     * @return
     */
    public static boolean comp(int[] a, int[] b) {

        if (a == null || a.length == 0 || b == null || b.length == 0)
            return false;
        if (a.length != b.length )
            return false;

        boolean flag = true;
        int count = 0;


        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j] * a[j]){
                    count = 0;

                    a[j] = -1; // I guess need to improve this section
                    break;
                }else{
                    count++;
                }
            }
            if (count == b.length)
                flag = false;
        }
        return flag;

//        Arrays.sort(a);
//        Arrays.sort(b);
//        boolean flag = true;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] * a[i] != b[i])
//                flag = false;
//        }
//        return flag;
    }

    public static void main(String[] args) {
        comp(new int[]{3,1,2}, new int[]{1,9, 4});
    }
}
