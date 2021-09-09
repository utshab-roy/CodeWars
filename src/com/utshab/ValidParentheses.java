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
    public static boolean validParentheses(String parens)
    {
        char[] chars = parens.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == ')'){
                if (chars[i] == '('){
                    stack.push(chars[i]);
                }else if(chars[i] == ')'){
                    if (stack.empty()){
                        return false;
                    }else {
                        if (stack.peek() == '('){
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
        boolean flag = validParentheses("(())((()())())");
        System.out.println(flag);
    }
}
