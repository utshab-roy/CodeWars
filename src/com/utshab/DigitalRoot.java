package com.utshab;

public class DigitalRoot {
    /**
     *problem link
     * https://www.codewars.com/kata/541c8630095125aba6000c00
     *
     * @param n
     * @return
     */
    public static int digital_root(int n) {
        if (n < 10)
            return n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum > 9)
            sum = digital_root(sum);
        return sum;
    }

    public static int digital_root2(int n) { // good clever approach
        while(n > 9){
            n = n/10 + n % 10; // it does the same thing
        }
        return(n);
    }

    public static void main(String[] args) {
        int val = digital_root2(123); //132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
        System.out.println(val);
    }
}
