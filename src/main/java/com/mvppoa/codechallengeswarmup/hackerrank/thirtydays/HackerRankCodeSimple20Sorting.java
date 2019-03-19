package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Link https://www.hackerrank.com/challenges/30-sorting
 * <p>
 * Objective
 * Today, we're discussing a simple sorting algorithm called Bubble Sort. Check out the Tutorial tab for learning materials and an instructional video!
 * <p>
 * Consider the following version of Bubble Sort:
 * <p>
 * for (int i = 0; i < n; i++) {
 * // Track number of elements swapped during a single array traversal
 * int numberOfSwaps = 0;
 * <p>
 * for (int j = 0; j < n - 1; j++) {
 * // Swap adjacent elements if they are in decreasing order
 * if (a[j] > a[j + 1]) {
 * swap(a[j], a[j + 1]);
 * numberOfSwaps++;
 * }
 * }
 * <p>
 * // If no elements were swapped during a traversal, array is sorted
 * if (numberOfSwaps == 0) {
 * break;
 * }
 * }
 * Task
 * Given an array, , of size  distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following  lines:
 * <p>
 * Array is sorted in numSwaps swaps.
 * where  is the number of swaps that took place.
 * First Element: firstElement
 * where  is the first element in the sorted array.
 * Last Element: lastElement
 * where  is the last element in the sorted array.
 * Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of elements in array .
 * The second line contains  space-separated integers describing the respective values of .
 * <p>
 * Constraints
 * <p>
 * , where .
 * Output Format
 * <p>
 * Print the following three lines of output:
 * <p>
 * Array is sorted in numSwaps swaps.
 * where  is the number of swaps that took place.
 * First Element: firstElement
 * where  is the first element in the sorted array.
 * Last Element: lastElement
 * where  is the last element in the sorted array.
 * Sample Input 0
 * <p>
 * 3
 * 1 2 3
 * Sample Output 0
 * <p>
 * Array is sorted in 0 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 0
 * <p>
 * The array is already sorted, so  swaps take place and we print the necessary  lines of output shown above.
 * <p>
 * Sample Input 1
 * <p>
 * 3
 * 3 2 1
 * Sample Output 1
 * <p>
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 1
 * <p>
 * The array  is not sorted, so we perform the following  swaps:
 * <p>
 * At this point the array is sorted and we print the necessary  lines of output shown above.
 */

public class HackerRankCodeSimple20Sorting {

    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = n - a_i;
        }
        a[50] = 75;
        a[0] = 150;

        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int ajone = a[j + 1];
                    int aj = a[j];
                    a[j] = ajone;
                    a[j+1] = aj;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);

    }
}
