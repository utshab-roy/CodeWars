package com.utshab;

public class IsPrimeNumber {
    /**
     * problem link
     * https://www.codewars.com/kata/5262119038c0985a5b00029f
     *
     * @param num
     * @return
     */

    public static boolean isPrime(int num) { // optimized
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) { // why it is more optimized ?
            if (num % i == 0)                       // Math.sqrt returns double, should I convert it to int ?
                return false;
        }
        return true;
    }

    public static boolean isPrime2(int num) { // not optimized
        if (num <= 0 || num == 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
