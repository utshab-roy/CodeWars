package com.utshab;

import java.util.*;

public class PickPeaks {
    /**
     * problem link
     * https://www.codewars.com/kata/5279f6fe5ab7f447890006a7
     *
     * @param arr
     * @return Map
     */

    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        // Your code here!
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        List<Integer> pos = new ArrayList<Integer>();
        List<Integer> peaks = new ArrayList<Integer>();

        for (int i = 1; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) // this two values cannot be peaks
                continue;

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                pos.add(i);
                peaks.add(arr[i]);
            }
        } // peaks handle end

        // for handle the plateaus
        int len = arr.length;
        boolean flag;
        for (int i = 1; i < arr.length; i++) {
            flag = false;
            if (arr[i - 1] >= arr[i]) {
                continue;
            } else {
                int count = 0;
                for (int j = i; j < len; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    } else if (arr[i] > arr[j]) {
                        if (count > 1) {
                            flag = true;
                        }
                    } else {
                        break;
                    }
                } // end of inner for loop
            }
            if (flag) {
                pos.add(i);
                peaks.add(arr[i]);
            }
        } // end of outer for loop

        // rearrange the array key value (sort by key)
        // I don't even know how it works, for sorting according to key converted into tree map
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < pos.size(); i++) {
            treeMap.put(pos.get(i), peaks.get(i));
        }

        // clear the pos and peaks list
        pos.clear();
        peaks.clear();

        treeMap.forEach((key, value) -> {
            pos.add(key);
            peaks.add(value);
        });

        map.put("pos", pos);
        map.put("peaks", peaks);
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        getPeaks(new int[]{11, -4, 7, -3, -5, 4, 4, -5, 5, 3, 14, 4, 0, 15, 11, 10, 6, 18, -2, 16, 16, 8, -2, 3, 15, -3});
        /**
         * expected:<{pos=[2, 5, 8, 10, 13, 17, 19, 24], peaks=[7, 4, 5, 14, 15, 18, 16, 15]}>
         *  but was:<{pos=[2, 8, 10, 13, 17, 24, 5, 19], peaks=[7, 5, 14, 15, 18, 15, 4, 16]}>
         */
    }
}
