package com.utshab;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PigLatin {
    /**
     * problem link
     * https://www.codewars.com/kata/520b9d2ad5c005041100000f
     *
     * @param str
     * @return
     */
    public static String pigIt(String str) {
        String[] array = str.split(" ");

        String finalStr = "";
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
            // check if the first char is a punctuation or not
            if (String.valueOf(chars[0]).matches("[.!?\\-]")){
                finalStr = finalStr + " " + String.valueOf(chars);
                continue;
            }
            char temp = chars[0]; //first char
            String newStr = array[i].substring(1);
            newStr =  newStr + String.valueOf(temp)+"ay";
            finalStr = finalStr + " " + newStr;
        }
        return finalStr.trim();
    }

    public static String pigItBest(String str) {
        String punctuation = "!?,.";
        List<String> words = new ArrayList(Arrays.asList(str.split(" ")));
        List<String> pigLatinWords = new ArrayList<String>();

        for (String word : words) {
            String newWord = !punctuation.contains(word) ? word.substring(1) + word.charAt(0) + "ay" : word;
            pigLatinWords.add(newWord);
        }
        return String.join(" ", pigLatinWords);
    }

    public static void main(String[] args) {
        pigItBest("Pig latin is cool !"); // igPay atinlay siay oolcay
    }
}
