package com.utshab;

import java.util.Locale;

public class CountingDuplicates {
    /**
     * problem link
     * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
     *
     * @param text
     * @return
     */
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int len = text.length();
        int count = 0;
        while (len > 0){
            int prevLen = len;
            text = text.replaceAll( String.valueOf(text.charAt(0)), "");
            int newLen = text.length();
            int removedCharLen = prevLen - newLen;
            if (removedCharLen > 1) // more than one occurrence
                count++;
            len = newLen;
        }
        return count;
    }

    /**
     * better and simple approach
     * @param text
     * @return
     */
    public static int duplicateCountAnother(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans ++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCountAnother("abAbdaadc"));
    }
}
