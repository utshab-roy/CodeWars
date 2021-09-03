package com.utshab;


public class Isogram {
    /**
     * problem link
     * https://www.codewars.com/kata/54ba84be607a92aa900000f1
     *
     * @param str
     * @return
     */
    public static boolean  isIsogram(String str) { // my solution
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//            char current = chars[i];
            for (int j = i+1; j < chars.length; j++) {
                if (chars[i] == chars[j])
                    return false;
            }
        }
        return true;
    }

    public static boolean  isIsogramBest(String str) { // best practice
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("moOse"));
    }
}
