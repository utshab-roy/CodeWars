package com.utshab;

public class DnaStrand {
    /**
     * problem link
     * https://www.codewars.com/kata/554e4a2f232cdd87d9000038
     *
     * @param dna
     * @return
     */
    public static String makeComplement(String dna) {
        //Your code
        //dna = dna.replaceAll("A","Z"); //another approach
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A'){
                chars[i] = 'T';
                continue;
            }
            if (chars[i] == 'T'){
                chars[i] = 'A';
                continue;
            }
            if (chars[i] == 'C'){
                chars[i] = 'G';
                continue;
            }
            if (chars[i] == 'G'){
                chars[i] = 'C';
                continue;
            }

        }
        return new String(chars);
    }

    // one of best practice
    public static String makeComplement2(String dna) {
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            chars[i] = getComplement(chars[i]);
        }

        return new String(chars);
    }

    private static char getComplement(char c) {
        switch(c) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'C': return 'G';
            case 'G': return 'C';
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}
