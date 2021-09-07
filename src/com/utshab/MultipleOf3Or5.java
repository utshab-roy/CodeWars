package com.utshab;

public class MultipleOf3Or5 {
    /**
     * problem link
     * https://www.codewars.com/kata/514b92a657cdc65150000006
     *
     * @param number
     * @return
     */
    public int solution(int number) {
        int i = 0;
        int total = 0;
        while(i < number){
            if (i % 3 == 0 || i % 5 == 0)
                total += i;
            i++;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(new MultipleOf3Or5().solution(10));
    }
}
