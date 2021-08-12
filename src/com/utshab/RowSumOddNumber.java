package com.utshab;

public class RowSumOddNumber {
    /**
     * problem link
     * https://www.codewars.com/kata/55fd2d567d94ac3bc9000064
     *
     * @param n
     * @return
     */

    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        int initialValue = (sum * 2) + 1;
        for (int i = 0; i < n; i++) {
            total = total + initialValue;
            initialValue += 2;
        }
        return  total;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(3));
    }
}
