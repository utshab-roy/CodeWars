package com.utshab;


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

    public static void main(String[] args) {
        pigIt("Pig latin is cool !"); // igPay atinlay siay oolcay
    }
}
