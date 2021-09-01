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
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) // this two values cannot be plateaus
                continue;

            boolean flag = false;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[i - 1] && arr[j] == arr[i] && arr[i] > arr[arr.length - 1]) {
                    flag = true;
                }
            }
            if (flag) {
                pos.add(i);
                peaks.add(arr[i]);
            }
        }

        map.put("pos", pos);
        map.put("peaks", peaks);
        System.out.println(map);
        return map;
    }

    public static void main(String[] args) {
        getPeaks(new int[]{1, 2, 2, 2, 3});
    }
}
