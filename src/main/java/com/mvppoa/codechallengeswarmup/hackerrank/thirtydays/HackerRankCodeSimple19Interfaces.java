package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Link https://www.hackerrank.com/challenges/30-interfaces/
 * <p>
 * Objective
 * Today, we're learning about Interfaces. Check out the Tutorial tab for learning materials and an instructional video!
 * <p>
 * Task
 * The AdvancedArithmetic interface and the method declaration for the abstract divisorSum(n) method are provided for you in the editor below.
 * <p>
 * Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface. The implementation for the divisorSum(n) method must return the sum of all divisors of .
 * <p>
 * Input Format
 * <p>
 * A single line containing an integer, .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * You are not responsible for printing anything to stdout. The locked template code in the editor below will call your code and print the necessary output.
 * <p>
 * Sample Input
 * <p>
 * 6
 * Sample Output
 * <p>
 * I implemented: AdvancedArithmetic
 * 12
 * Explanation
 * <p>
 * The integer  is evenly divisible by , , , and . Our divisorSum method should return the sum of these numbers, which is . The Solution class then prints  on the first line, followed by the sum returned by divisorSum (which is ) on the second line.
 */

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {

        int value = n;
        int result = 0;

        while(value > 0){
            if(n % value == 0) {
                result += value;
            }
            value--;
        }

        return result;
    }
}


public class HackerRankCodeSimple19Interfaces {

    public static void main(String[] args) {

        int n = 6;

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
