package com.utshab;

class LongestConsec {
    /**
     * problem link
     * https://www.codewars.com/kata/56a5d994ac971f1ac500003e
     *
     * @param strarr
     * @param k
     * @return
     */
    public static String longestConsec(String[] strarr, int k) {
        String[] str = strarr.clone();
        if (str.length < 1 || k < 1 || str.length < k)
            return "";

        String longestString = "";
        for (int i = 0; i < str.length; i++) {
            String currentString = "";
            int x = i;
            for (int j = 0; j < k; j++) {
                if (x < str.length){
                    currentString += str[x];
                }
                x++;
            }
            if (currentString.length() > longestString.length())
                longestString = currentString;
        }
        return longestString;
    }

    public static void main(String[] args) {
        String str = longestConsec(new String[]{"a", "ab", "abc", "abc", "ab"}, 2);
        System.out.println(str);
        //returns first longest consecutive string : abigailtheta
    }
}
