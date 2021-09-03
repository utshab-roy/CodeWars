package com.utshab;

import java.util.regex.Pattern;

public class BasicRegex {
    /**
     * problem link
     * https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
     *
     * @param pin
     * @return
     */
    public static boolean validatePin(String pin) {
        // best practice
//        return pin.matches("[0-9]{4}|[0-9]{6}");
        
        // my solution
        int len = pin.length();
        if (len == 4 || len == 6) {
            boolean flag = pin.matches("[0-9]+");
            return flag;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1294"));
    }
}
