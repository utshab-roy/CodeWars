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

        String key = "";
        int val = 0;

        for (int i = 0; i < ch.length; i++) {
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

    public static void main(String[] args) {
        getAtoms("Mg2O");
    }
}
