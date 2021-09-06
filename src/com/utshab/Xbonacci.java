package com.utshab;


import java.util.Arrays;

public class Xbonacci {
    /**
     * problem link
     * https://www.codewars.com/kata/556e0fccc392c527f20000c5
     *
     * @param signature
     * @param n
     * @return
     */

    public double[] xbonacci(double[] signature, int n) {
        int signatureLen = signature.length;
        if (n < signatureLen){
            double[] array = new double[n];
            for (int i = 0; i < n; i++) {
                array[i] = signature[i];
            }
            return array;
        }

        double[] array = new double[n];
        for (int i = 0; i < signatureLen; i++) {
            array[i] = signature[i];
        }

        for (int i = signatureLen; i < n; i++) {
            double nextVal = 0;
            int x = i;
            for (int j = 0; j < signatureLen; j++) {
                nextVal += array[ x - 1];
                x--;
            }
            array[i] = nextVal;
        }
        return array;
    }

    public static void main(String[] args) {
        new Xbonacci().xbonacci(new double []{1,0,0,0,0,0,1},10);
        new Xbonacci().xbonacci(new double []{1,0,0,0,0,0,1},6);
    }
}
