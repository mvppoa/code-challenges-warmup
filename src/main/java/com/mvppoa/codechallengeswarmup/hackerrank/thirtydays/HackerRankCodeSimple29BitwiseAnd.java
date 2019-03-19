package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.hackerrank.com/challenges/30-bitwise-and/problem
//Objective
//Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!
//
//Task
//Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.
//
//Input Format
//
//The first line contains an integer, , the number of test cases.
//Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.
//
//Constraints
//
//Output Format
//
//For each test case, print the maximum possible value of  on a new line.
//
//Sample Input
//
//3
//5 2
//8 5
//2 2
//Sample Output
//
//1
//4
//0
//Explanation
//
//
//
//All possible values of  and  are:
//
//The maximum possible value of  that is also  is , so we print  on a new line.

public class HackerRankCodeSimple29BitwiseAnd {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String string = Integer.toBinaryString(5);
        int integer = 8;

        String binaryInteger = Integer.toBinaryString(integer);

        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b & integer;
            System.out.println( Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer)
                    + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }

    }

    static class BinaryString {

        BinaryString(String string){
            for( byte b : string.getBytes() ){
                System.out.print(Integer.toBinaryString(b) + " ");
            }
            System.out.println();
        }

        BinaryString(Integer integer){
            System.out.println(Integer.toBinaryString(integer));
        }
    }

}


