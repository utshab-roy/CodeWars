package com.utshab.leetcode;

import java.util.LinkedList;
import java.util.List;

public class LongestCommonPrefix {
    /**
     * problem link
     * https://leetcode.com/problems/longest-common-prefix/
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        List list = new LinkedList();
        String smallest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < smallest.length()) {
                smallest = strs[i];
            }
        }
        for (int i = 0; i < smallest.length(); i++) { // this loop will go up-to the smallest word length
            String commonCharString = String.valueOf(smallest.charAt(i));
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if (!commonCharString.equals(String.valueOf(strs[j].charAt(i)))){
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(commonCharString);
            else
                break;
        }

        String str = String.join("", list);
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"cir", "car"});
    }
}
