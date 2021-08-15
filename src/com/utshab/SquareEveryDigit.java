package com.utshab;

public class SquareEveryDigit {
    /**
     * problem link
     * https://www.codewars.com/kata/546e2562b03326a88e000020
     *
     * @param n
     * @return
     */
    public int squareDigits(int n) {
        if (n == 0)
            return 0;
        String str = "";
        int number;
        while (n > 0){
            number = n % 10;
            str = (number * number) + str;
            n = n/10;
        }
        return Integer.parseInt(str);
    }
}
