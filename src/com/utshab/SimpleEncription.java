package com.utshab;

import java.util.stream.Stream;

public class SimpleEncription {
    /**
     * problem link
     * https://www.codewars.com/kata/57814d79a56c88e3e0000786
     *
     * @param text
     * @param n
     * @return
     */
    public static String encrypt(final String text, final int n) {
        /**
         * null check should always be at first
         * otherwise it throws nullPointerException in runtime
         * but why ?
         * if ( text.isEmpty() || text == null || n < 1) what is wrong with this ???
         */
        if (text == null || text.isEmpty() || n < 1)
            return text;

        String newText = text;
        for (int j = 0; j < n; j++) {
            String evenString = "";
            String oddString = "";
            for (int i = 0; i < newText.length(); i++) {
                if (i % 2 == 0) {
                    evenString += newText.charAt(i);
                } else {
                    oddString += newText.charAt(i);
                }
            }
            newText = oddString + evenString;
        }
        return newText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        /**
         * null check should always be at first
         * otherwise it throws nullPointerException in runtime
         */
        if (encryptedText == null || encryptedText.isEmpty() || n < 1)
            return encryptedText;
        String newText = encryptedText;
        String str = "";
        for (int i = 0; i < n; i++) {
            str = "";
            int mid = newText.length() / 2;
            for (int j = 0; j < newText.length() / 2; j++) {
                str += newText.charAt(mid);
                str += newText.charAt(j);
                mid++;
            }
            if (newText.length() % 2 != 0)
                str += newText.charAt(newText.length() - 1);

            newText = str;
        }
        return str;
    }

    public static void main(String[] args) {
//        System.out.println(null);
//        System.out.println(encrypt("012345", 3));
        System.out.println(decrypt(null, 0));
    }
}
