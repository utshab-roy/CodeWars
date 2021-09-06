package com.utshab.leetcode;

public class ReverseInteger {
    /**
     * problem link
     * https://leetcode.com/problems/reverse-integer/
     *
     * @param x
     * @return
     */
    public int reverse(int x) {
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x = Math.abs(x);
        }

        String str = "";
        while (x > 0) {
            int a = x % 10;
            x = x / 10;
            str = str + a;
        }

        try {
            int result = Integer.parseInt(str);
            if (negative){
                result *= -1;
            }
            return result;
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        int res = new ReverseInteger().reverse(-1234);
        System.out.println(res);
    }
}
