package com.utshab;

public class FindDivisor {

    /**
     * problem link
     * https://www.codewars.com/kata/542c0f198e077084c0000c2e
     *
     * @param n
     * @return
     */

    public static long numberOfDivisors(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        for (int i = 1; i < n/2 + 1; i++) {
            if (n % i == 0)
                count++;
        }
        count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(8));
    }
}
