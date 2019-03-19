package com.mvppoa.codechallengeswarmup.hackerrank.thirtydays;

import java.util.Scanner;

/**
 * @Link https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 * <p>
 * Objective
 * Today, we're working with Binary Search Trees (BSTs). Check out the Tutorial tab for learning materials and an instructional video!
 * <p>
 * Task
 * The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, , pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
 * <p>
 * Input Format
 * <p>
 * The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
 * The first line contains an integer, , denoting the number of nodes in the tree.
 * Each of the  subsequent lines contains an integer, , denoting the value of an element that must be added to the BST.
 * <p>
 * Output Format
 * <p>
 * The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.
 * <p>
 * Sample Input
 * <p>
 * 7
 * 3
 * 5
 * 2
 * 1
 * 4
 * 6
 * 7
 * Sample Output
 * <p>
 * 3
 * Explanation
 * <p>
 * The input forms the following BST:
 * <p>
 * BST.png
 * <p>
 * The longest root-to-leaf path is shown below:
 * <p>
 * Longest RTL.png
 * <p>
 * There are  nodes in this path that are connected by  edges, meaning our BST's . Thus, we print  as our answer.
 */

public class HackerRankCodeSimple22BinarySearchTreeGetNodeHeight {


    public static int getHeight(Node root) {
        if(root == null){
            return -1;
        }

        int left = getHeight(root.left) +1;
        int right = getHeight(root.right)+1;

        return Math.max(left,right);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    //7 - inputs
    //3
    //5
    //2
    //1
    //4
    //6
    //7
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
