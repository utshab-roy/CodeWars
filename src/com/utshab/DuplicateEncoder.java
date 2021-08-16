package com.utshab;

public class DuplicateEncoder {
    /**
     * problem link
     * https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
     *
     * @param word
     * @return string
     */
    static String encode(String word){
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        // loop through each char of the word
        int count = 0;
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            // check if the char has multiple occurrence
            count = word.length() - word.replace(Character.toString(chars[i]), "").length();
             /**
              * count operation is not fully clear, how do I know that word.replace().length() returns occurrence
              * answer: replace with "" string actually shrinks down the string for that particular string
              * so when we deduct it from the original string we get the number of occurrence
             */
            if (count == 1)
                str = str + "(";
            else
                str = str + ")";
        }
        return str;
    }

    public static void main(String[] args) {
        encode("hello");
    }
}
