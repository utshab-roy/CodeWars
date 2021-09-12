package com.utshab;

import java.util.ArrayList;
import java.util.List;

public class NextSmallerNumber {
    /**
     * problem link
     * https://www.codewars.com/kata/5659c6d896bc135c4c00021e
     *
     * @param n
     * @return
     */
    public static long nextSmaller(long n) {
        long originalNum = n;
        List<Long> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == 0) { // problem is in here, how to handle zero
                if (i + 2 >= list.size()) {
                    continue;
                }
            }
            if (list.get(i) > list.get(i - 1)) {
                Long temp = list.get(i);
                list.set(i, list.get(i - 1));
                list.set(i - 1, temp);
                break;
            }
        }

        String str = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            str += list.get(i);
        }

        long val = Long.parseLong(str);
        if (val == originalNum)
            return -1;

        return val;
    }

    public static void main(String[] args) {
        System.out.println(nextSmaller(907));
    }
}
