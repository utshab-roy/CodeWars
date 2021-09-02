package com.utshab;

import java.util.*;

public class PickPeaks {

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
        boolean flag = true;
        int position = 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[0] >= arr[i] || arr[i] <= arr[arr.length - 1]  ){
                flag = false;
                break;
            }

            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] != arr[j]) {
                    flag = false;
                    break;
                }
            }

        } // end of for loop
        if (flag) {
            pos.add(position);
            peaks.add(arr[position]);
        }

        map.put("pos", pos);
        map.put("peaks", peaks);
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        getPeaks(new int[]{1, 2, 2, 2, 1});
    }
}
