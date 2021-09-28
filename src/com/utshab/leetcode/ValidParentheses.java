package com.utshab.leetcode;

import java.util.Stack;

public class ValidParentheses {

    /**
     * problem link
     * https://leetcode.com/problems/valid-parentheses/
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) { // my solution

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[')
                stack.push(chars[i]);
            else if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
                if (stack.empty())
                    return false;
                else {
                    switch (chars[i]) {
                        case ')':
                            if (stack.peek() == '(')
                                stack.pop();
                            else
                                stack.push(chars[i]);
                            break;
                        case '}':
                            if (stack.peek() == '{')
                                stack.pop();
                            else
                                stack.push(chars[i]);
                            break;
                        case ']':
                            if (stack.peek() == '[')
                                stack.pop();
                            else
                                stack.push(chars[i]);
                            break;
                    }
                }
            }
        }
        if (stack.empty())
            return true;
        return false;
    }

    public boolean isValidBetter(String s) { // better clean code
        Stack<Character> stack = new Stack<Character>();
        for(Character c:s.toCharArray()) {
            if(c=='{' || c=='[' || c=='(') {
                stack.push(c);
            }else if(c=='}' && !stack.isEmpty() &&stack.peek()=='{') {
                stack.pop();
            }else if(c==')' && !stack.isEmpty() &&stack.peek()=='(') {
                stack.pop();
            }else if(c==']' && !stack.isEmpty() &&stack.peek()=='[') {
                stack.pop();
            }else {
                return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}
