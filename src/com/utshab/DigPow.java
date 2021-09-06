package com.utshab;

public class DigPow {
    /**
     * problem link
     * https://www.codewars.com/kata/5552101f47fc5178b1000050
     *
     * @param n
     * @param p
     * @return
     */
    public static long digPow(int n, int p) {
        int originalNum = n;
        int lenOfNum = String.valueOf(n).length();
        int total = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            total += Math.pow(lastDigit, lenOfNum + p - 1);
            lenOfNum--;
            n /= 10;
        }

        if (total % originalNum == 0)
            return total / originalNum;

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(46288, 3)); // returns 51
        System.out.println(digPow(695, 2)); // returns 2
    }
}
