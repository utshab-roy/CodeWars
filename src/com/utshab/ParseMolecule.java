package com.utshab;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class ParseMolecule {
    /**
     * problem link
     * https://www.codewars.com/kata/52f831fa9d332c6591000511
     *
     * @param formula
     * @return
     */

    public static Map<String,Integer> getAtoms(String formula) {
        // Your code here!
        HashMap map =  new HashMap<String,Integer>();
        char[] ch = formula.toCharArray();
        int len = ch.length;

        // making a map which contains all the molecule name and initial val 0
        for (int i = 0; i < ch.length; i++) {
            String key;
            if (ch[i] >= 'A' && ch[i] <= 'Z'){
                key = ch[i] + "";
                int nextIndex = i + 1;
                if (nextIndex < len){
                    if (ch[nextIndex] >= 'a' && ch[nextIndex] <= 'z'){
                        key = String.valueOf(ch[i])  + String.valueOf(ch[++i]);
                    }
                    else {
                        key =   ch[i] + "";
                    }
                }
                map.put(key, 0);
            } // end of if it is [A-Z, a-z]
        } // end of making key for the molecule


        for (int i = 0; i < ch.length; i++) {
            // is it a symbol [, (
            // is it a later H, Mg
            String key;
            if (ch[i] >= 'A' && ch[i] <= 'Z'){
                key = ch[i] + "";
                int nextIndex = i + 1;
                if (nextIndex < len){
                    if (ch[nextIndex] >= 'a' && ch[nextIndex] <= 'z'){
                        key = String.valueOf(ch[i])  + String.valueOf(ch[++i]);
                    }
                    else {
                        key =   ch[i] + "";
                    }
                }
            } // end of if it is [A-Z, a-z]

            // is it number 1,2,3
            if (Character.isDigit(ch[i])){
                int val = Character.getNumericValue(ch[i]);

            }

        } // end of for loop

        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        getAtoms("Mg(OH)2");
    }

    public static Map<String,Integer> getAtoms2(String formula) {
        // Your code here!

        HashMap map =  new HashMap<String,Integer>();

        char[] ch = formula.toCharArray();
        int len = ch.length;

        String key = "";
        int val = -1;

        for (int i = 0; i < ch.length; i++) {
            if (key != ""){
                if (map.containsKey(key)){
                    map.put(key, (int)map.get(key) + 1);
                }else{
                    map.put(key, 1);
                }
            }

            if (ch[i] >= 'A' && ch[i] <= 'Z'){
                key = ch[i] + "";
                int nextIndex = i + 1;
                if (nextIndex < len){
                    if (ch[nextIndex] >= 'a' && ch[nextIndex] <= 'z'){
                        key = String.valueOf(ch[i])  + String.valueOf(ch[++i]);
                    }
                    else {
                        key =   ch[i] + "";
                    }
                }
            } // end of if it is [A-Z, a-z]

            if (Character.isDigit(ch[i])){
                val = Character.getNumericValue(ch[i]);
                if (key != ""){
                    map.put(key, val);
                    key = "";
                    val = -1;
                }
//                System.out.println(val);
            }
        } // end of for loop

        System.out.println(map);
        return map;
    }
}
