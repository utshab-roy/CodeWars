package com.utshab;

public class WhoLikesIt {

    /**
     * problem link
     * https://www.codewars.com/kata/5266876b8f4bf2da9b000362
     *
     * @param names
     * @return
     */
    public static String whoLikesIt(String... names) {
        //Do your magic here
        int len = names.length;
        switch (len) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0]+ ", "+ names[1] + " and " + names[2] + " like this";
            default:
                return names[0]+ ", "+ names[1] + " and " + (len-2) + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Peter", "Jhon", "Roy", "Ashik"));;
    }
}
