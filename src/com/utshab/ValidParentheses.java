package com.utshab;

import java.util.Stack;

public class ValidParentheses {
    /**
     * problem link
     * https://www.codewars.com/kata/52774a314c2333f0a7000688
     *
     * @param parens
     * @return
     */

    public static boolean validParenthesesOptimized(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') count++;
            else if (str.charAt(i) == ')') count--;
            if (count < 0) return false;
        }
        if (count == 0) return true;
        else return false;
    }

    public static boolean validParentheses(String parens) {
        char[] chars = parens.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == ')') {
                if (chars[i] == '(') {
                    stack.push(chars[i]);
                } else if (chars[i] == ')') {
                    if (stack.empty()) {
                        return false;
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                    }
                }
            }
        }
        if (stack.empty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean flag = validParenthesesOptimized("(())((()())())");
        System.out.println(flag);
    }
}
