package com.utshab.leetcode;

public class Palindrome {
    /**
     * problem link
     * https://leetcode.com/problems/palindrome-number
     *
     * @param x
     * @return boolean
     */
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int len = String.valueOf(x).length();
        int end = len - 1;
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[end])
                return false;
            end--;
        }
        return true;
    }

    public boolean isPalindromeWithoutString(int x){
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reverse = 0;
        while(x > reverse){ // only reversing half of the int
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return x == reverse || x == reverse/10; // ignoring the last digit if length is odd
    }

    public static void main(String[] args) {
        boolean flag = new Palindrome().isPalindrome(2222);
        System.out.println(flag);
    }
}
