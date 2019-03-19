package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

/**
 * @Link https://www.hackerrank.com/challenges/30-generics/problem
 * Objective
 * Today we're discussing Generics; be aware that not all languages support this construct, so fewer languages are enabled for this challenge. Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * Write a single generic function named printArray; this function must take an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.
 *
 * Note: You must use generics to solve this challenge. Do not write overloaded functions.
 *
 * Input Format
 *
 * The locked Solution class in your editor will pass different types of arrays to your printArray function.
 *
 * Constraints
 *
 * You must have exactly  function named printArray.
 * Output Format
 *
 * Your printArray function should print each element of its generic array parameter on a new line.
 */

class Printer <T> {

    /**
     *    Method Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/

    // Write your code here
    public void printArray(T[] array){
        for(T arrayValue : array){
            System.out.println(arrayValue);
        }
    }

}

public class HackerRankCodeSimple21Generics {

    public static void main(String[] args) {
        int n = 1;
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = 1;
        }

        n = 1;
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = "1";
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }

    }
}
