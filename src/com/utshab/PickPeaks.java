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
        int len = arr.length;
        boolean flag;
        for (int i = 1; i < arr.length; i++) {
            flag = true;
            if (arr[i - 1] >= arr[i] || arr[len - 1] >= arr[i]) {
                continue;
            }else {
                for (int j = i; j < len - 1; j++) {
                    if (arr[i] != arr[j]){
                        flag = false;
                        break;
                    }
                }
            }
            if (flag){
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
        getPeaks(new int[]{1,2,3,6,4,1,2,3,2,1});
    }
}
