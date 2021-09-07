package com.utshab;

class Persist {
    /**
     * problem link
     * https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
     *
     * @param n
     * @return
     */
    public static int persistence(long n) {
        long num = n;
        int count = 0;
        long total;
        while (n > 10) {
            total = 1;
            while (num > 0) {
                total *= num % 10;
                num /= 10;
            }
            n = total;
            num = total;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(39)); // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit
    }
}
