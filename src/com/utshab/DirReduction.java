package com.utshab;

import java.util.Stack;

public class DirReduction {
    /**
     * problem link
     * https://www.codewars.com/kata/550f22f4d758534c1100025a
     *
     * @param arr
     * @return
     */
    public static String[] dirReduc(String[] arr) {
        String[] myArr = arr.clone();

        if (myArr.length <= 1)
            return myArr;

        Stack<String> stack = new Stack<String>();
        stack.push(myArr[0]);

        for (int i = 1; i < myArr.length; i++) {
            if (stack.empty()) {
                stack.push(myArr[i]);
                continue;
            }
            String peak = stack.peek();

            if (peak.equals("NORTH")) {
                if (myArr[i].equals("SOUTH")) {
                    stack.pop();
                } else {
                    stack.push(myArr[i]);
                }
            }
            if (peak.equals("SOUTH")) {
                if (myArr[i].equals("NORTH")) {
                    stack.pop();
                } else {
                    stack.push(myArr[i]);
                }
            }
            if (peak.equals("EAST")) {
                if (myArr[i].equals("WEST")) {
                    stack.pop();
                } else {
                    stack.push(myArr[i]);
                }
            }
            if (peak.equals("WEST")) {
                if (myArr[i].equals("EAST")) {
                    stack.pop();
                } else {
                    stack.push(myArr[i]);
                }
            }
        }

//        System.out.println(stack);
        String[] returnArray = new String[stack.size()];
        returnArray = stack.toArray(returnArray);
        return returnArray;
    }

    public static String[] dirReduc2(String[] arr) {
        String[] myArr = arr.clone();

        if (myArr.length <= 1)
            return myArr;

        Stack<String> stack = new Stack<String>();
        stack.push(myArr[0]);

        for (int i = 1; i < myArr.length; i++) {
            if (stack.empty()) {
                stack.push(myArr[i]);
                continue;
            }

            String peak = stack.peek();
            switch (peak) {
                case "NORTH":
                    if (myArr[i].equals("SOUTH")) {
                        stack.pop();
                    } else {
                        stack.push(myArr[i]);
                    }
                    break;
                case "SOUTH":
                    if (myArr[i].equals("NORTH")) {
                        stack.pop();
                    } else {
                        stack.push(myArr[i]);
                    }
                    break;
                case "EAST":
                    if (myArr[i].equals("WEST")) {
                        stack.pop();
                    } else {
                        stack.push(myArr[i]);
                    }
                    break;
                case "WEST":
                    if (myArr[i].equals("EAST")) {
                        stack.pop();
                    } else {
                        stack.push(myArr[i]);
                    }
                    break;
            }
        }
        String[] returnArray = new String[stack.size()];
        return stack.toArray(returnArray);
    }

    public static void main(String[] args) {
        dirReduc2(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
    }
}
