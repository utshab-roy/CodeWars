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

    public static void main(String[] args) {
        boolean flag = new Palindrome().isPalindrome(2222);
        System.out.println(flag);
    }
}
