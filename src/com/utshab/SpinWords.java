package com.utshab;

import java.util.*;

public class SpinWords {
    /**
     * problem link
     * https://www.codewars.com/kata/5264d2b162488dc400000001
     *
     * @param sentence
     * @return
     */
    public static String spinWords(String sentence) {
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= 5){
                StringBuilder sb = new StringBuilder();
                sb.append(str[i]);
                str[i] =  sb.reverse().toString();
            }
        }
        return String.join(" ", str);
    }

    public static void main(String[] args) {
        spinWords("Hey fellow warriors"); // returns : Hey wollef sroirraw
    }
}
