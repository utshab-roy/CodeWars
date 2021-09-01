package com.utshab;

public class CountIPAddresses {

    /**
     * problem link
     * https://www.codewars.com/kata/526989a41034285187000de4
     *
     * @param start
     * @param end
     * @return
     */
    public static long ipsBetween(String start, String end) {
        String[] arrOfStart = start.split("\\.");
        String[] arrOfEnd = end.split("\\.");
        int len = arrOfStart.length;

        // this array will be used to convert ip address to decimal value
        int[] val = {(int) Math.pow(2, 24), (int) Math.pow(2, 16), (int) Math.pow(2, 8), 1};

        long ipStart = 0;
        long ipEnd = 0;
        for (int i = 0; i < len; i++) {
            long valueStart = Integer.parseInt(arrOfStart[i]) * val[i];
            ipStart = ipStart + valueStart;

            long valueEnd = Integer.parseInt(arrOfEnd[i]) * val[i];
            ipEnd = ipEnd + valueEnd;
        }
        return ipEnd - ipStart;
    }

    public static void main(String[] args) {
        ipsBetween("10.0.0.0", "10.0.0.50");
    }
}
