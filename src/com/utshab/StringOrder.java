package com.utshab;

import java.util.HashMap;

public class StringOrder {
    /**
     * problem link
     * https://www.codewars.com/kata/55c45be3b2079eccff00010f
     *
     * @param words
     * @return str
     */
    public static String order(String words) {
        //the word is empty so empty string
        if (words == "")
            return  "";

        HashMap<Integer, String> map = new HashMap<>();

        String[] eachWord = words.split("\\W+"); //creating each word string array

        for (int i = 0; i < eachWord.length; i++) {
            char[] chars = eachWord[i].toCharArray();
            for(char ch : chars){
                if(Character.isDigit(ch)){
                    map.put((int)ch, eachWord[i]); //does HashMap auto sort the values if the key is int ??
                }
            }
        }
        String str = "";
        for (String value : map.values()) { //just need the values; for both key and value use entrySet()
            str = str + value + " ";
        }
        str = str.trim(); //trimming to remove the extra white space

        return str;
    }

    public static void main(String[] args) {
        order("is2 Thi1s T4est 3a");
    }
}
