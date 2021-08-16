package com.utshab;

import java.util.ArrayList;

public class StringSplit {
    /**
     * problem link
     * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
     *
     * @param s
     * @return
     */
    public static String[] solution(String s) {
        char[] chars = s.toCharArray();
        ArrayList<String> words = new ArrayList<String>();

        if (chars.length % 2 == 0) { // is even length
            for (int i = 0; i < chars.length; i++) {
                String str = Character.toString(chars[i]) + Character.toString(chars[++i]) ;
                words.add(str);
            }
        }

        if (chars.length % 2 != 0) { // is odd length
            for (int i = 0; i < chars.length; i++) {
                String str;
                if (i == chars.length - 1){
                    str = Character.toString(chars[i]) + "_";
                }else {
                    str = Character.toString(chars[i]) + Character.toString(chars[++i]) ;
                }
                words.add(str);
            }
        }
        //converting ArrayList to String array
        String[] stringArray = words.toArray(new String[0]);
        //due to JVM optimizations, using new String[0] is better now
        return stringArray;
    }

    public static void main(String[] args) {
        solution("Hello");
    }
}
