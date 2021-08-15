package com.utshab;

public class Money {
    /**
     * problem link
     * https://www.codewars.com/kata/563f037412e5ada593000114
     *
     * @param principal
     * @param interest
     * @param tax
     * @param desired
     * @return
     */
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        // your code
        int years = 0;
        while (principal < desired){
            double interestAmount = principal * interest;
            double taxAmount = interestAmount * tax;
            principal = principal + interestAmount - taxAmount;
            years++;
        }
        return  years;
    }
}
